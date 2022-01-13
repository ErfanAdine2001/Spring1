package ir.Erfan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final MessageService emailService;

    private final MessageService smsService;

    public UserService(@Qualifier("emailService")MessageService emailService, @Qualifier("smsService") MessageService smsService) {
        this.smsService = smsService;
        this.emailService = emailService;

    }
//
//    public UserService(MessageService emailService, MessageService smsService) {
//        this.emailService = emailService;
//
//        this.smsService = smsService;
//    }


    public void  sendMessage(String sms){
        smsService.sendMessage(sms);
    }
    public void  sendEmail(String email){
        emailService.sendMessage(email);

    }
}
