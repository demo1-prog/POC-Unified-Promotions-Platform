package com.niks.promotion.controller;

import com.niks.common.model.PromotionResponse;
import com.niks.promotion.service.PromotionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.niks.promotion.model.Promotion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    private final PromotionService promotionService;

    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Promotion> createPromotion(@RequestBody Promotion promotion) {
        return promotionService.createPromotion(promotion);
    }

    @GetMapping("/{id}")
    public Mono<Promotion> getPromotionById(@PathVariable String id) {
        return promotionService.getPromotionById(id);
    }

    @GetMapping
    public Flux<Promotion> getAllPromotions() {
        return promotionService.getAllPromotions();
    }

    @PutMapping("/{id}")
    public Mono<Promotion> updatePromotion(@PathVariable String id, @RequestBody Promotion promotion) {
        return promotionService.updatePromotion(id, promotion);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deletePromotion(@PathVariable String id) {
        return promotionService.deletePromotion(id);
    }

    @GetMapping("/by-event/{eventId}")
    public Flux<PromotionResponse> getPromotionsByEvent(@PathVariable String eventId) {
        return promotionService.getPromotionsByEventId(eventId);
    }
}
