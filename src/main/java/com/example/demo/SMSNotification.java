package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements Notification{
    public void send(String mes){
        System.out.println("Message From SMS" + mes);
    }
}
