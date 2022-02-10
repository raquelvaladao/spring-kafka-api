package com.args.brtravels.clients.clash.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResponseClan {

	@JsonProperty("items")
	private List<Clan> clans;

}