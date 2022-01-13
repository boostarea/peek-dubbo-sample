package com.example.controller;

import com.example.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/13
 **/
@RestController
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @GetMapping("test/{name}")
    public void test(String name) {
        String consumer = consumerService.consumer(name);
    }
}
