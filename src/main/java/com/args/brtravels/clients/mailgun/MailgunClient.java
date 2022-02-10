package com.args.brtravels.clients.mailgun;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        value = "${mailgun.baseUrl}",
        name = "${mailgun.clientName}",
        configuration = MailgunConfig.class
)
public interface MailgunClient {
}
