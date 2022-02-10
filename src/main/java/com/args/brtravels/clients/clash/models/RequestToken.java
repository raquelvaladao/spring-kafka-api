package com.args.brtravels.clients.clash.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RequestToken {

    private String token;
}
