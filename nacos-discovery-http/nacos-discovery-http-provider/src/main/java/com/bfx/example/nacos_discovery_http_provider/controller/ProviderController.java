package com.bfx.example.nacos_discovery_http_provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Value("${server.port}")
    private int port;

    public String hello() {
        return "hello";
    }

    @GetMapping(value = "sayHello")
    public String sayHello(@RequestParam String world) {
        return "当前服务端口为：" + port + "，请求参数：" + world;
    }
}
