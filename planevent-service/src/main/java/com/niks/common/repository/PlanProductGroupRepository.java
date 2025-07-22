package com.niks.common.repository;

import com.niks.common.model.PlanProductGroup;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanProductGroupRepository extends ReactiveMongoRepository<PlanProductGroup,String> {
}
