package com.niks.promotion.service;

import com.niks.common.model.PromotionResponse;
import com.niks.promotion.repository.PromotionRepository;
import org.springframework.stereotype.Service;
import com.niks.promotion.model.Promotion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PromotionService {

    private final PromotionRepository promotionRepository;

    public PromotionService(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public Mono<Promotion> createPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    public Mono<Promotion> getPromotionById(String id) {
        return promotionRepository.findById(id);
    }

    public Flux<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    public Mono<Promotion> updatePromotion(String id, Promotion updatedPromotion) {
        return promotionRepository.findById(id)
                .flatMap(existing -> {
                    updatedPromotion.setId(id);
                    return promotionRepository.save(updatedPromotion);
                });
    }

    public Mono<Void> deletePromotion(String id) {
        return promotionRepository.deleteById(id);
    }

    public Flux<PromotionResponse> getPromotionsByEventId(String eventId) {
        return promotionRepository.findByEventId(eventId)
                .map(promo -> new PromotionResponse(
                        String.valueOf(promo.getPromotionId()),
                        promo.getPromotionType()
                ));
    }
}
