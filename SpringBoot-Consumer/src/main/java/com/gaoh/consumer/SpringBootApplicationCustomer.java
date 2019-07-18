package com.gaoh.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author gaoh
 * @version 1.0
 * @date 2019/7/15 10:05
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootApplicationCustomer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationCustomer.class, args);
    }
}
