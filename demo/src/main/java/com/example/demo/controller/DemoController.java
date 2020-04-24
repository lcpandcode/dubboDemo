package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demoinf.demo.IDemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : liangcp6
 * @description:TODO
 * @date : 2019/10/31 15:22
 */
@RestController
public class DemoController {
    @Reference(version = "1.1")
    private IDemoService demoServiceImpl;

    @RequestMapping("test/demo/dubbo")
    public String hello(@RequestParam String hello){
        return demoServiceImpl.helloDemo(hello);
    }
}