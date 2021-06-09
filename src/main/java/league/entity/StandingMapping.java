package league.entity;

import javax.persistence.Entity;

@Entity
public class StandingMapping {

	// leagueId_CountryId_TeamId
	private String id;

	private Integer linkedStanding;
	private Integer teamId;
	private Integer LeagueId;

	public StandingMapping(Integer linkedStanding, Integer leagueId, Integer countryId, Integer teamId) {
		super();
		
		this.linkedStanding = linkedStanding;
		this.teamId = teamId;
		LeagueId = leagueId;
		this.countryId = countryId;
	}

	public StandingMapping() {
		super();
	}

	private Integer countryId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getLinkedStanding() {
		return linkedStanding;
	}

	public void setLinkedStanding(Integer linkedStanding) {
		this.linkedStanding = linkedStanding;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getLeagueId() {
		return LeagueId;
	}

	public void setLeagueId(Integer leagueId) {
		LeagueId = leagueId;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
}
