package com.niks.common.controller;

import com.niks.common.model.PlanProductGroup;
import com.niks.common.service.PlanProductGroupService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/plan-product-groups")
public class PlanProductGroupController {

    private final PlanProductGroupService service;

    public PlanProductGroupController(PlanProductGroupService service) {
        this.service = service;
    }

    @GetMapping
    public Flux<PlanProductGroup> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Mono<PlanProductGroup> create(@RequestBody PlanProductGroup group) {
        return service.create(group);
    }
}
