package com.example.springwebflux.application;

import com.example.springwebflux.domain.WebfluxRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebfluxHandler {

    private final WebfluxRepository webfluxRepository;

}
