package com.args.brtravels.clients.clash.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class Clan {

	@JsonProperty("warFrequency")
	private String warFrequency;

	@JsonProperty("warLeague")
	private WarLeague warLeague;

	@JsonProperty("requiredVersusTrophies")
	private int requiredVersusTrophies;

	@JsonProperty("requiredTownhallLevel")
	private int requiredTownhallLevel;

	@JsonProperty("warWins")
	private int warWins;

	@JsonProperty("warWinStreak")
	private int warWinStreak;

	@JsonProperty("clanLevel")
	private int clanLevel;

	@JsonProperty("requiredTrophies")
	private int requiredTrophies;

	@JsonProperty("badgeUrls")
	private BadgeUrls badgeUrls;

	@JsonProperty("isWarLogPublic")
	private boolean isWarLogPublic;

	@JsonProperty("type")
	private String type;

	@JsonProperty("chatLanguage")
	private ChatLanguage chatLanguage;

	@JsonProperty("clanPoints")
	private int clanPoints;

	@JsonProperty("clanVersusPoints")
	private int clanVersusPoints;

	@JsonProperty("members")
	private int members;

	@JsonProperty("name")
	private String name;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("tag")
	private String tag;
}