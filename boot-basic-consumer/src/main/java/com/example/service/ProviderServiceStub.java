package com.example.service;

import com.example.api.ProviderService;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/17
 **/
public class ProviderServiceStub {

    private final ProviderService providerService;

    public ProviderServiceStub(ProviderService providerService) {
        this.providerService = providerService;
    }

    public String sayHello(String name) {
        return providerService.sayHello("stu-" + name);
    }


}
