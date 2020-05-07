package com.itmush.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicConfigServerApplication.class, args);
    }

}
