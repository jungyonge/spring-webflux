package com.example.springwebflux.api;

import com.example.springwebflux.application.WebfluxHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WebfluxController {

    private final WebfluxHandler webfluxHandler;

    @GetMapping("/test")
    public void test() {
        webfluxHandler.insetTest();
    }

}
