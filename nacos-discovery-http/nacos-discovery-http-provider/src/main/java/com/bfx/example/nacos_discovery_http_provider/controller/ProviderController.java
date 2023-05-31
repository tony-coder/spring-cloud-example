package com.bfx.example.nacos_discovery_http_provider.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    public String hello() {
        return "hello";
    }
}
