package com.niks.common.controller;

import com.niks.common.model.StoreGroup;
import com.niks.common.service.PlanProductGroupService;
import com.niks.common.service.StoreGroupService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/store-groups")
public class StoreGroupController {

    private final StoreGroupService service;

    public StoreGroupController(StoreGroupService service) {
        this.service = service;
    }

    @GetMapping
    public Flux<StoreGroup> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Mono<StoreGroup> create(@RequestBody StoreGroup group) {
        return service.create(group);
    }
}
