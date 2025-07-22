package com.niks.planxapi.service;

import com.niks.common.model.EventPromotionResponse;
import com.niks.common.model.PromotionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;

@Service
public class PlanXapiService {

    private static final Logger log = LoggerFactory.getLogger(PlanXapiService.class);
    private final WebClient planeventWebClient;
    private final WebClient promotionWebClient;

    public PlanXapiService(@Qualifier("planeventWebClient") WebClient planeventWebClient,
                           @Qualifier("promotionWebClient") WebClient promotionWebClient) {
        this.planeventWebClient = planeventWebClient;
        this.promotionWebClient = promotionWebClient;
    }

    public Mono<EventPromotionResponse> getEventWithPromotions(String eventId) {
        Mono<EventPromotionResponse> eventMono = planeventWebClient.get()
                .uri("/api/planevents/with-promotions/{eventId}", eventId)
                .retrieve()
                .bodyToMono(EventPromotionResponse.class)
                .doOnNext(event -> log.info("Fetched event: {}", event))
                .onErrorResume(e -> {
                    log.error("Error fetching event: {}", e.getMessage());
                    return Mono.empty();
                });

        Mono<List<PromotionResponse>> promotionsMono = promotionWebClient.get()
                .uri("/promotions/by-event/{eventId}", eventId)
                .retrieve()
                .bodyToFlux(PromotionResponse.class)
                .collectList()
                .onErrorResume(e -> {
                    log.error("Error fetching promotions: {}", e.getMessage());
                    return Mono.just(Collections.emptyList());
                });

        return Mono.zip(eventMono, promotionsMono)
                .map(tuple -> {
                    EventPromotionResponse event = tuple.getT1();
                    List<PromotionResponse> promotions = tuple.getT2();
                    if (event != null) {
                        event.setPromotions(promotions);
                    }
                    return event;
                }).defaultIfEmpty(new EventPromotionResponse());
    }

}
