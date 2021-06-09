package com.league.dtos;

public class StandingDto extends ResponseDto {
	private Integer id;
	private String countryName;
	private Integer countrrId;
	private Integer leagueId;
	private String leagueName;
	private Integer overallLeaguePosition;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getCountrrId() {
		return countrrId;
	}

	public void setCountrrId(Integer countrrId) {
		this.countrrId = countrrId;
	}

	public Integer getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public Integer getTeamId() {
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

	private Integer teamId;
	private String teamName;

	public Integer getOverallLeaguePosition() {
		return overallLeaguePosition;
	}

	public void setOverallLeaguePosition(Integer overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}
}
