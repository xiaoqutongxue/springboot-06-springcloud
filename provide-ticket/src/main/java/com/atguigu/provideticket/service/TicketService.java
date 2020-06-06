package com.atguigu.provideticket.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public String getTicket(){
        System.out.println("这是8001端口的实例");
        return "《厉害了，我的国》";
    }
}
