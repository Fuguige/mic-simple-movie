package com.itmush.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicSimpleDiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicSimpleDiscoveryEurekaApplication.class, args);
    }

}
