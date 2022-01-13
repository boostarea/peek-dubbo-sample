package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.ProviderService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/13
 **/
@Service
public class ConsumerService {

    @Reference(loadbalance = "random")
    private ProviderService providerService;

    @PostConstruct
    public void init() {
        this.consumer("boot-consumer");
    }

    public String consumer(String name) {
        String res = providerService.sayHello(name);
        System.out.println(res);
        return res;
    }
}
