package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final Notification notification;

    @Autowired
    public NotificationService(@Qualifier("emailNotification") Notification notification){
        this.notification = notification;
    }

    public void sendMessage(){
        notification.send("Hello");
    }
}
