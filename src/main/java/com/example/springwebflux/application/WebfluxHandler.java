package com.example.springwebflux.application;

import com.example.springwebflux.domain.WebfluxRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WebfluxHandler {

    private final WebfluxRepository webfluxRepository;

}
