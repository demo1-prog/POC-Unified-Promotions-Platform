package com.niks.common.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.niks.common.model.Planevent;

@Repository
public interface PlaneventRepository extends ReactiveMongoRepository<Planevent,String> {
}
