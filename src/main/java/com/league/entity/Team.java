package com.league.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team implements GenericTeam {
	@Id
	private Integer teamId;
	private String teamName;
	private String teamBadge;
	private List<Player> players;

	public List<Player> getPlayers() {
		return players;
	}

	public Team() {

	}

	public Team(Integer teamId, String teamName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Integer getTteamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamBadge() {
		return teamBadge;
	}

	public void setTeamBadge(String teamBadge) {
		this.teamBadge = teamBadge;
	}

}
