package com.ms.email.services;

import com.ms.email.models.EmailModel;
import com.ms.email.repositories.EmailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
 
    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel){
        //SMTP from gmail

    }
}
