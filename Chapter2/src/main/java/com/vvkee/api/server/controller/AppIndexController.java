package com.vvkee.api.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuhf on 2017/11/29.
 */
@RestController
public class AppIndexController {

    @RequestMapping("/")
    public Map<String, String> index() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("name", "API Server");
        result.put("version", "0.0.1");
        return result;
    }
}
