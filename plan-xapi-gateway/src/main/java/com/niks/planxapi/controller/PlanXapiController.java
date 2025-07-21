package com.niks.planxapi.controller;

import com.niks.planxapi.model.EventPromotionResponse;
import com.niks.planxapi.service.PlanXapiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/xapi")
public class PlanXapiController {

    private final PlanXapiService planXapiService;

    @Autowired
    public PlanXapiController(PlanXapiService planXapiService) {
        this.planXapiService = planXapiService;
    }

    @GetMapping("/event-with-promotions/{eventId}")
    public Mono<EventPromotionResponse> getEventWithPromotions(@PathVariable String eventId) {
        return planXapiService.getEventWithPromotions(eventId);
    }
}
