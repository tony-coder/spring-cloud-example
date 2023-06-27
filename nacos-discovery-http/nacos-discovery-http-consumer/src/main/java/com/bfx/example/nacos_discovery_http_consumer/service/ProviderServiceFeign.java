package com.bfx.example.nacos_discovery_http_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-discovery-http-provider")
public interface ProviderServiceFeign {
    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam("world") String world);
}
