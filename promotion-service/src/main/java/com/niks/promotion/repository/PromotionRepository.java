package com.niks.promotion.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.niks.promotion.model.Promotion;
import reactor.core.publisher.Flux;

@Repository
public interface PromotionRepository extends ReactiveMongoRepository<Promotion, String> {

    Flux<Promotion> findByEventId(String eventId);
}
