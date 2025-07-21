package com.niks.common.service;

import com.niks.common.model.Planevent;
import com.niks.common.repository.PlaneventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaneventService {

    @Autowired
    private PlaneventRepository repository;

    public Mono<Planevent> createPlanevent(Planevent planevent) {
        return repository.save(planevent);
    }

    public Flux<Planevent> getAllPlanevents() {
        return repository.findAll();
    }

    public Mono<Planevent> getPlaneventById(String id) {
        return repository.findById(id);
    }

    public Mono<Void> deletePlanevent(String id) {
        return repository.deleteById(id);
    }
}
