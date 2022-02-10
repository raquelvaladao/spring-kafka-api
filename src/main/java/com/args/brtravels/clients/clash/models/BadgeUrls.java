package com.args.brtravels.clients.clash.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class BadgeUrls{

	@JsonProperty("large")
	private String large;
}