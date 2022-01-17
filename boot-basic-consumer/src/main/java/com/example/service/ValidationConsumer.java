package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.ValidationParameter;
import com.example.api.ValidationService;
import org.springframework.stereotype.Component;

import javax.validation.ValidationException;
import java.util.Date;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/17
 **/
@Component
public class ValidationConsumer {

    @Reference(validation = "true")
    private ValidationService validationService;

    public void testSaveDelete() {
        // Save OK
        ValidationParameter parameter = new ValidationParameter();
        parameter.setName("liangfei");
        parameter.setEmail("liangfei@liang.fei");
        parameter.setAge(50);
        parameter.setLoginDate(new Date(System.currentTimeMillis() - 1000000));
        parameter.setExpiryDate(new Date(System.currentTimeMillis() + 1000000));
        validationService.save(parameter);
        System.out.println("Validation Save OK");

        // Save Error
        try {
            parameter = new ValidationParameter();
            validationService.save(parameter);
        } catch (ValidationException e) {
            System.err.println("Validation Save ERROR");
            e.printStackTrace();
        }

        // Delete OK
        validationService.delete(2, "abc");
        System.out.println("Validation Delete OK");

        // Delete Error
        try {
            validationService.delete(0, "abc");
        } catch (ValidationException e) {
            System.err.println("Validation Delete ERROR");
            e.printStackTrace();
        }
    }
}
