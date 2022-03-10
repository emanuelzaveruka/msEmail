package com.ms.email.servicetest;

import com.ms.email.enums.StatusEmail;
import com.ms.email.models.EmailModel;
import com.ms.email.repositories.EmailRepository;
import com.ms.email.services.EmailService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @MockBean
    private EmailRepository emailRepository;

    @Test
    public void sendEmailTest(){
        EmailModel emailModel = createEmailModel();
        emailRepository.save(emailModel);
        Mockito.verify(emailRepository, Mockito.times(1)).save(emailModel);
    }

    private EmailModel createEmailModel() {
        EmailModel emailModel = new EmailModel();
        emailModel.setEmailTo("fulano");
        emailModel.setStatusEmail(StatusEmail.SENT);
        return emailModel;
    }
}
