package com.niks.common.service;

import com.niks.common.model.PlanProductGroup;
import com.niks.common.repository.PlanProductGroupRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlanProductGroupService {

    private final PlanProductGroupRepository repository;

    public PlanProductGroupService(PlanProductGroupRepository repository) {
        this.repository = repository;
    }

    public Flux<PlanProductGroup> getAll() {
        return repository.findAll();
    }

    public Mono<PlanProductGroup> getById(String id) {
        return repository.findById(id);
    }

    public Mono<PlanProductGroup> create(PlanProductGroup group) {
        return repository.save(group);
    }
}
