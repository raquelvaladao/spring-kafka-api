package com.args.brtravels.controller;


import com.args.brtravels.clients.clash.ClashClient;
import com.args.brtravels.clients.clash.models.RequestToken;
import com.args.brtravels.clients.clash.models.ResponseClan;
import com.args.brtravels.clients.clash.models.ResponsePlayerStatus;
import com.args.brtravels.models.Message;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static java.lang.String.*;
import static org.springframework.http.HttpStatus.*;


@RestController
@RequestMapping("api/v1/clash")
@Slf4j
@AllArgsConstructor
public class ClashController {

    private ClashClient clashClient;
    private KafkaTemplate<String, Message> kafkaTemplate;

    @PostMapping
    public ResponseEntity<String> getClans(@RequestParam("clanName") String clanName,
                                           @RequestParam("email") String email) {

            ResponseClan response = clashClient
                    .getClansByNameAndLimitResponse(clanName, 10);

            ResponsePlayerStatus statusResponse = clashClient
                    .verifyPlayerStatus(
                            "#U90G08Y0",
                            RequestToken
                                    .builder()
                                    .token("xbN7gbeg")
                                    .build()
                    );

            if (statusResponse.getStatus().equals("invalid")) {
                kafkaTemplate.send(
                        "userStatus",
                        Message.builder()
                                .email(email)
                                .body("List of clans sent")
                                .playerTag(statusResponse.getTag())
                                .date(LocalDateTime.now())
                                .build()
                );
            }
            return ResponseEntity.status(OK).build();
    }


}
