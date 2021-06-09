package com.league.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.league.entity.enums.PlayerType;

@Entity
public class Player implements StakeHolder {
	@Id
	private Integer playerId;
	private String playerName;
	private String playerNumber;
	private Country playerCountry;
	private PlayerType playerType;
	private String playerAge;
	private String playerMatchPlayed;
	private Integer playerGoals;
	private Integer playerYellowCards;
	private Integer playerRedCards;

	private Integer teamId;

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(String playerNumber) {
		this.playerNumber = playerNumber;
	}

	public Country getPlayerCountry() {
		return playerCountry;
	}

	public void setPlayerCountry(Country playerCountry) {
		this.playerCountry = playerCountry;
	}

	public PlayerType getPlayerType() {
		return playerType;
	}

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

	public String getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(String playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerMatchPlayed() {
		return playerMatchPlayed;
	}

	public void setPlayerMatchPlayed(String playerMatchPlayed) {
		this.playerMatchPlayed = playerMatchPlayed;
	}

	public Integer getPlayerGoals() {
		return playerGoals;
	}

	public void setPlayerGoals(Integer playerGoals) {
		this.playerGoals = playerGoals;
	}

	public Integer getPlayerYellowCards() {
		return playerYellowCards;
	}

	public void setPlayerYellowCards(Integer playerYellowCards) {
		this.playerYellowCards = playerYellowCards;
	}

	public Integer getPlayerRedCards() {
		return playerRedCards;
	}

	public void setPlayerRedCards(Integer playerRedCards) {
		this.playerRedCards = playerRedCards;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

}
