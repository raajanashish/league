package com.league.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.entity.Standing;
import com.league.exception.StandingException;

@Service
public class StandingServce {

	@Autowired
	private LeagueService leagueService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private TeamService teamService;

	@Autowired
	StandingDashboard standingDashboard;

	public Standing getStanding(String leagueName, String countryName, String teamName) throws StandingException {
			Integer leagueId = leagueService.getLeaugeId(leagueName);
			if (null == leagueId) {
				throw new StandingException("Provided league name is invalid");
			}
			Integer teamId = teamService.getTeamId(teamName);
			if (null == teamId) {
				throw new StandingException("Provided team name is invalid");
			}
			Integer countryId = countryService.getCountryId(countryName);
			if (null == countryId) {
				throw new StandingException("Provided country name is invalid");
			}

			String mappingId = buildMappingId(leagueId, countryId, teamId);
			Integer staindingId = standingDashboard.getLinkedStandingId(mappingId);

			return standingDashboard.getStanding(staindingId);
		
	}

	private String buildMappingId(Integer leagueId, Integer countryId, Integer teamId) {
		StringBuilder builder = new StringBuilder();
		return builder.append(leagueId).append("_").append(countryId).append("_").append(teamId).toString();
	}

}
