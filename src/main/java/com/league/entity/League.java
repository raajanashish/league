package com.league.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class League implements GenericLeague {
	@Id
	private Integer leagueId;
	private String LeagueName;

	public Integer getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return LeagueName;
	}

	public void setLeagueName(String leagueName) {
		LeagueName = leagueName;
	}

	public League() {
		super();
	}

	public League(Integer leagueId, String leagueName) {
		super();
		this.leagueId = leagueId;
		LeagueName = leagueName;
	}
}
