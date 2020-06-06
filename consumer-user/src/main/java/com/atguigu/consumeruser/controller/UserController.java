package com.atguigu.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy/{name}")
    public String buyTicket(@PathVariable("name") String name){
        // System.out.println(name);
        // url是注册中心eurake的服务名字加访问的地址名字
        String s = restTemplate.getForObject("http://PROVIDE-TICKET/ticket", String.class);
        return name + "购买了" + s;
    }
}
