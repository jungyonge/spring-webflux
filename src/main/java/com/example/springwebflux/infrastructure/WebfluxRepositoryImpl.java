package com.example.springwebflux.infrastructure;

import com.example.springwebflux.domain.Webflux;
import com.example.springwebflux.domain.WebfluxRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class WebfluxRepositoryImpl implements WebfluxRepository {

    private final WebfluxR2dbcRepository webfluxR2dbcRepository;

    @Override
    public Mono<Webflux> save(Webflux webflux) {
        return webfluxR2dbcRepository.save(webflux);
    }

    @Override
    public Flux<Webflux> findAll() {
        return webfluxR2dbcRepository.findAll();
    }
}
