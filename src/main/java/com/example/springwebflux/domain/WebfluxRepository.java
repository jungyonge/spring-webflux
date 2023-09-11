package com.example.springwebflux.domain;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WebfluxRepository {

    Mono<Webflux> save(Webflux webflux);

    Flux<Webflux> findAll();

}
