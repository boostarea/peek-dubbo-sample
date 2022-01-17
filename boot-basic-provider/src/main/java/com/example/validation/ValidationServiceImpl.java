package com.example.validation;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.ValidationParameter;
import com.example.api.ValidationService;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2022/1/17
 **/
@Service
public class ValidationServiceImpl implements ValidationService {
    @Override
    public void save(ValidationParameter parameter) {

    }

    @Override
    public void update(ValidationParameter parameter) {

    }

    @Override
    public void delete(long id, String operator) {

    }
}
