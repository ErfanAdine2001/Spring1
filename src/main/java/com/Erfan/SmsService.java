package com.Erfan;

import org.springframework.stereotype.Service;

@Service
public class SmsService implements MessageService{
    @Override
    public void senderMessage(String sms) {
        System.out.println(" sms message: "+sms);
    }


}
