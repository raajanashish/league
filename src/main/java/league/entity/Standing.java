package league.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Standing implements GenericStanding {
	@Id
	private Integer id;
	private String countryName;
	private Integer countrrId;
	private Integer leagueId;
	private String leagueName;
	private Integer teamId;
	private String teamName;
	private Integer overallLeaguePosition;
	
	public String getCountryName() {
		return countryName;
	}

	public Standing() {
		super();
	}

	public Standing(Integer id, Integer countrrId, String countryName, Integer leagueId, String leagueName,
			Integer teamId, String teamName, Integer overallLeaguePosition) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.countrrId = countrrId;
		this.leagueId = leagueId;
		this.leagueName = leagueName;
		this.teamId = teamId;
		this.teamName = teamName;
		this.overallLeaguePosition = overallLeaguePosition;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
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

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getOverallLeaguePosition() {
		return overallLeaguePosition;
	}

	public void setOverallLeaguePosition(Integer overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCountrrId() {
		return countrrId;
	}

	public void setCountrrId(Integer countrrId) {
		this.countrrId = countrrId;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
}
