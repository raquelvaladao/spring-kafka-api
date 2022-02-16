package com.args.brtravels.clients.mailgun.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class EmailRequest {

    private String from;
    private List<String> to;
    private String subject;
    private String text;
}
