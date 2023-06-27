package com.bfx.example.nacos_discovery_http_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.bfx.example.nacos_discovery_http_consumer.service")
@EnableDiscoveryClient
public class NacosHttpConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosHttpConsumerApplication.class, args);
    }
}
