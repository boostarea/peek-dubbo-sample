package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.ProviderService;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/12
 **/
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayHello(String name) {
        System.out.println("boot-provider-01");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name + " Hello, boot-provider";
    }
}
