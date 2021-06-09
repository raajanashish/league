package league.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import league.entity.Standing;
import league.exception.StandingException;

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
		try {
			Integer leagueId = leagueService.getLeaugeId(leagueName);
			Integer teamId = teamService.getTeamId(teamName);
			Integer countryId = countryService.getCountryId(countryName);

			String mappingId = buildMappingId(leagueId, countryId, teamId);
			Integer staindingId = standingDashboard.getLinkedStandingId(mappingId);

			return standingDashboard.getStanding(staindingId);

		} catch (Exception e) {
			throw new StandingException("error occured while getting the standing", e);
		}
	}

	private String buildMappingId(Integer leagueId, Integer countryId, Integer teamId) {
		StringBuilder builder = new StringBuilder();
		builder.append(leagueId).append("_").append(countryId).append("_").append(teamId);
		return null;
	}

}
