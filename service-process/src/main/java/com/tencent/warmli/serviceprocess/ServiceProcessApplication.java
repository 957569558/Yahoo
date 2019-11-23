package com.tencent.warmli.serviceprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProcessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProcessApplication.class, args);
    }

}
