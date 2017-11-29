package com.vvkee.api.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuhf on 2017/11/29.
 */

@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    public String index() {
        return "hello api server";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
