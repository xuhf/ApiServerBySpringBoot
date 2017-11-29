package com.vvkee.api.server.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xuhf on 2017/11/29.
 */
@SpringBootApplication(scanBasePackages = "com.vvkee.api.server")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
