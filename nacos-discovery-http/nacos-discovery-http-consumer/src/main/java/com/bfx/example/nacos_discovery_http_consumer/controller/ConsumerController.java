package com.bfx.example.nacos_discovery_http_consumer.controller;

import com.bfx.example.nacos_discovery_http_consumer.service.ProviderServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ProviderServiceFeign providerServiceFeign;

    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return providerServiceFeign.sayHello("hello world");
    }

}
