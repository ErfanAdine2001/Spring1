package ir.Erfan;

import org.springframework.stereotype.Service;

@Service
public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("send email:" + message);
    }
}
