package com.tencent.warmli.servicecommons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceCommonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCommonsApplication.class, args);
    }

}
