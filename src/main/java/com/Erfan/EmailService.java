package com.Erfan;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

    @Override
    public void senderMessage(String email) {
        System.out.println("email message: "+ email);
    }
}
