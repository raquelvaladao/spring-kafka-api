package com.args.brtravels.clients.mailgun;


import com.args.brtravels.clients.mailgun.models.EmailRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;

@FeignClient(
        url = "${mailgun.baseUrl}",
        value = "${mailgun.clientName}",
        configuration = MailgunConfig.class
)
public interface MailgunClient {

    @PostMapping(consumes = APPLICATION_FORM_URLENCODED_VALUE)
    void sendEmail(@RequestBody EmailRequest request);

}

