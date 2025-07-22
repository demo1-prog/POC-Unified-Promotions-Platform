package com.niks.common.controller;

import com.niks.common.model.EventPromotionResponse;
import com.niks.common.model.Planevent;
import com.niks.common.service.PlaneventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/planevents")
public class PlaneventController {

    @Autowired
    private PlaneventService service;

    @PostMapping
    public Mono<Planevent> create(@RequestBody Planevent planevent) {
        return service.createPlanevent(planevent);
    }

    @GetMapping
    public Flux<Planevent> getAll() {
        return service.getAllPlanevents();
    }

    @GetMapping("/{id}")
    public Mono<Planevent> getById(@PathVariable String id) {
        return service.getPlaneventById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deletePlanevent(id);
    }

    @GetMapping("/with-promotions/{eventId}")
    public Mono<EventPromotionResponse> getPartialEvent(@PathVariable String eventId) {
        return service.getPlaneventById(eventId)
                .map(event -> {
                    EventPromotionResponse response = new EventPromotionResponse();
                    response.setEventId(event.getId());
                    response.setEventName(event.getName());
                    response.setEventType(event.getEventType());
                    response.setDivisionIds(event.getDivisionIds());
                    response.setPromotions(new ArrayList<>());
                    return response;
                });
    }
}
