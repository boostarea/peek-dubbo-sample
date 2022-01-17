package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.example.api.ProviderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/13
 **/
@Service
public class ConsumerService {

    @Reference(group = "provider_02", timeout = 5000)
    // @Resource
    private ProviderService providerService;

    // @PostConstruct
    // public void init() {
    //     this.consumer("boot-consumer");
    // }

    public String consumer(String name) {
        String res = providerService.sayHello(name);
        System.out.println(res);
        return res;
    }

    public List<String> listMerger() {
        List<String> res = providerService.listMerger();
        res.forEach(System.out::println);
        return res;
    }

    public String echo() {
        EchoService echoService = (EchoService) this.providerService;
        return (String) echoService.$echo("Hello");
    }
}
