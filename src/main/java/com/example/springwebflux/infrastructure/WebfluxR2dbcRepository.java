package com.example.springwebflux.infrastructure;

import com.example.springwebflux.domain.Webflux;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface WebfluxR2dbcRepository extends R2dbcRepository<Webflux, Long> {

}
