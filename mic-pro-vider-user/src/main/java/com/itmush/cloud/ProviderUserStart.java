package com.itmush.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableDiscoveryClient 与 @EnableEurekaClient 效果一样
@EnableEurekaClient
public class ProviderUserStart {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserStart.class, args);
    }

}
