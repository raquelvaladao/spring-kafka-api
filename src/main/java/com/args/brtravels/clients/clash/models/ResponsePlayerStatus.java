package com.args.brtravels.clients.clash.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResponsePlayerStatus {

    @JsonProperty(value = "tag")
    private String tag;

    @JsonProperty(value = "token")
    private String token;

    @JsonProperty(value = "status")
    private String status;
}