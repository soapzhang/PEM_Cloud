package com.fpi.pem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class PemWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PemWebApplication.class, args);
    }

}
