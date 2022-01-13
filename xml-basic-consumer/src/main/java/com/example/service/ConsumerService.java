package com.example.service;

import com.example.api.ProviderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/13
 **/
@Service
public class ConsumerService {

    @Resource
    private ProviderService providerService;

    public String consumer(String name) {
        String res = providerService.sayHello(name);
        return res;
    }
}
