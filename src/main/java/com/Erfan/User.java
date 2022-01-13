package com.Erfan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class User {

    private final MessageService smsService;
    private final MessageService emailService;

    public User(@Qualifier("smsService") MessageService smsService,@Qualifier("emailService") MessageService emailService) {
        this.smsService = smsService;
        this.emailService=emailService;
    }

    public void sendSms(String m){
        smsService.senderMessage(m);
    }

    public void sendEmail(String m){
        emailService.senderMessage(m);
    }
}
