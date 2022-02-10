package com.args.brtravels.controller;


import com.args.brtravels.clients.clash.ClashClient;
import com.args.brtravels.clients.clash.models.RequestToken;
import com.args.brtravels.clients.clash.models.ResponseClan;
import com.args.brtravels.clients.clash.models.ResponsePlayerStatus;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@AllArgsConstructor
public class ClashController {

    private ClashClient clashClient;

    @GetMapping
    public ResponseClan getClans() {

        ResponseClan response = clashClient
                .getClansByNameAndLimitResponse("Axe", 10);
        log.info("{}", response.toString());

        ResponsePlayerStatus statusResponse = clashClient
                .verifyPlayerStatus(
                        "#U90G08Y0",
                        RequestToken
                                .builder()
                                .token("xbN7gbeg")
                                .build()
                );
        log.info("{}", statusResponse.toString());

        return response;
    }
}
