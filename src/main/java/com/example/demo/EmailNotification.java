package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements Notification{
    public void send(String mes){
        System.out.println(mes);
    }
}
