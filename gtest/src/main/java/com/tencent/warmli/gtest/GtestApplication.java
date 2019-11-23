package com.tencent.warmli.gtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GtestApplication.class, args);
    }

}
