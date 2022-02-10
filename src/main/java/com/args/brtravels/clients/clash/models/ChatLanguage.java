package com.args.brtravels.clients.clash.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatLanguage{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("languageCode")
	private String languageCode;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getLanguageCode(){
		return languageCode;
	}
}