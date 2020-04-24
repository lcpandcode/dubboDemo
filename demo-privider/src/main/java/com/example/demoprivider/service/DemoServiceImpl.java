package com.example.demoprivider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demoinf.demo.IDemoService;

/**
 * @author : liangcp6
 * @description:TODO
 * @date : 2019/10/31 10:32
 */
@Service(version = "1.1")
public class DemoServiceImpl implements IDemoService {
    @Override
    public String helloDemo(String hello) {
        return "hello done:" + hello;
    }
}