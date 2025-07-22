package com.niks.common.service;

import com.niks.common.model.PlanProductGroup;
import com.niks.common.model.StoreGroup;
import com.niks.common.repository.StoreGroupRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StoreGroupService {

    private final StoreGroupRepository storeGroupRepository;

    public StoreGroupService(StoreGroupRepository storeGroupRepository) {
        this.storeGroupRepository = storeGroupRepository;
    }

    public Flux<StoreGroup> getAll(){
        return storeGroupRepository.findAll();
    }

    public Mono<StoreGroup> getById(String id) {
        return storeGroupRepository.findById(id);
    }

    public Mono<StoreGroup> create(StoreGroup group) {
        return storeGroupRepository.save(group);
    }
}
