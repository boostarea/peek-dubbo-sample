package com.example.controller;

import com.example.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/13
 **/
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("test/{name}")
    public String test(@PathVariable String name) {
        return consumerService.consumer(name);
    }
}
