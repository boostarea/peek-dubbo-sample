package com.example.controller;

import com.example.service.ConsumerService;
import com.example.service.ValidationConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private ValidationConsumer validationConsumer;

    @GetMapping("test/{name}")
    public String test(@PathVariable String name) {
        return consumerService.consumer(name);
    }

    @GetMapping("merger")
    public List<String> merger() {
        return consumerService.listMerger();
    }

    @GetMapping("saveAndDelete")
    public void saveAndDelete() {
        validationConsumer.testSaveDelete();
    }

    @GetMapping("echo")
    public String echo() {
        return consumerService.echo();
    }
}
