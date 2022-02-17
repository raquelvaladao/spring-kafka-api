package com.args.brtravels.service;

import com.args.brtravels.clients.mailgun.MailgunClient;
import com.args.brtravels.clients.mailgun.models.EmailRequest;
import com.args.brtravels.models.Message;
import com.args.brtravels.repository.MessageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UserStatusListenerService {

    private MailgunClient mailgunClient;
    private MessageRepository messageRepository;

    @KafkaListener(
            topics = "userStatus",
            groupId = "userStatusGroup",
            containerFactory = "messageFactory"
    )
    public void listenUserStatusQueue(Message message) {
        log.info("I'm a consumer and I'm reading the queue then sending notifications :-)");

        EmailRequest email = EmailRequest.builder()
                .from(message.getEmail())
                .to(List.of(message.getEmail()))
                .subject("Subject")
                .text("Text")
                .build();

        mailgunClient.sendEmail(email);

//        messageRepository.save(message);
    }

}
