package com.niks.planxapi.service;

import com.niks.planxapi.model.EventPromotionResponse;
import com.niks.planxapi.model.PromotionResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class PlanXapiService {

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
                .bodyToMono(EventPromotionResponse.class);

        Mono<List<PromotionResponse>> promotionsMono = promotionWebClient.get()
                .uri("/api/promotions/by-event/{eventId}", eventId)
                .retrieve()
                .bodyToFlux(PromotionResponse.class)
                .collectList();

        return Mono.zip(eventMono, promotionsMono)
                .map(tuple -> {
                    EventPromotionResponse event = tuple.getT1();
                    List<PromotionResponse> promotions = tuple.getT2();
                    event.setPromotions(promotions);
                    return event;
                });
    }

}
