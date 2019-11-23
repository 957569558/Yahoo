package com.tencent.warmli.servicescore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceScoreApplication {

public static void main(String[] args) {
        SpringApplication.run(ServiceScoreApplication.class, args);
    }

}
