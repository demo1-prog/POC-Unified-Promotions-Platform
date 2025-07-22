package com.niks.common.repository;

import com.niks.common.model.StoreGroup;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreGroupRepository extends ReactiveMongoRepository<StoreGroup,String> {
}
