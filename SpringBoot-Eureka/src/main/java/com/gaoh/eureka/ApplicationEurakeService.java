package com.gaoh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gaoh
 * @version 1.0
 * @date 2019/7/18 16:36
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurakeService {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurakeService.class, args);
    }
}
