package com.example.springwebflux.application;

import com.example.springwebflux.domain.Webflux;
import com.example.springwebflux.domain.WebfluxRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class WebfluxHandler {

    private final WebfluxRepository webfluxRepository;

    public void insetTest(){
        Webflux webflux = new Webflux();
        webflux.setId(1);
        webflux.setTest1(1);
//        webfluxRepository.save(webflux);

        Flux<Webflux> tt = webfluxRepository.findAll();

        System.out.println(tt);
        System.out.println(tt);
        System.out.println(tt);

    }

}
