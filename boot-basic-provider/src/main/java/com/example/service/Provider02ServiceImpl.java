package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.ProviderService;

import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/12
 **/
@Service(group = "provider_02")
public class Provider02ServiceImpl implements ProviderService {

    @Override
    public String sayHello(String name) {
        System.out.println("boot-provider-01-02");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name + " Hello, boot-provider-01-02";
    }

    @Override
    public List<String> listMerger() {
        return Arrays.asList("02-01");
    }
}
