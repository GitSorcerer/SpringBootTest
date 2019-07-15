package com.gaoh.consumer.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoh
 * @version 1.0
 * @date 2019/7/15 10:11
 */
@RestController
@Api
public class Hello {


    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }
}
