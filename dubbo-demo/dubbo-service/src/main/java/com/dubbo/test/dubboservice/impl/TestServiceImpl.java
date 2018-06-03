package com.dubbo.test.dubboservice.impl;

import com.dubbo.test.dubboclient.service.TestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Override
    public String sayName(String name) {
        return name;
    }
}
