package com.example.service;

import com.example.api.ProviderService;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/12
 **/
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayHello(String name) {
        System.out.println("xml-provider-01");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name + " Hello";
    }
}
