package com.args.brtravels.clients.clash.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Location{

	@JsonProperty("isCountry")
	private boolean isCountry;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;
}