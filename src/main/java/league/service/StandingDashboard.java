package league.service;

import java.util.HashMap;
import java.util.Map;

import league.entity.Standing;
import league.entity.StandingMapping;

public class StandingDashboard {

	// here other cache can be used loke redis/ elastic cache
	// every time we update the db this will be updated
	private static Map<Integer, Standing> standings = new HashMap<Integer, Standing>();
	private static Map<String, StandingMapping> standingMaping = new HashMap<String, StandingMapping>();

	public Integer getLinkedStandingId(String mappingId) {
		// TODO Auto-generated method stub
		return standingMaping.get(mappingId).getLinkedStanding();
	}

	public Standing getStanding(int standingId) {
		return standings.get(standingId);

	}

	public void initStandingData() {
		standings.put(1,
				new Standing(1, CountryService.countries.get(1).getCountryId(),
						CountryService.countries.get(1).getCountryName(), LeagueService.leagues.get(1).getLeagueId(),
						LeagueService.leagues.get(1).getLeagueName(), TeamService.teams.get(1).getTteamId(),
						TeamService.teams.get(1).getTeamName(), 1));
		standings.put(2,
				new Standing(2, CountryService.countries.get(2).getCountryId(),
						CountryService.countries.get(2).getCountryName(), LeagueService.leagues.get(1).getLeagueId(),
						LeagueService.leagues.get(1).getLeagueName(), TeamService.teams.get(2).getTteamId(),
						TeamService.teams.get(2).getTeamName(), 2));
		standings.put(2,
				new Standing(3, CountryService.countries.get(3).getCountryId(),
						CountryService.countries.get(3).getCountryName(), LeagueService.leagues.get(1).getLeagueId(),
						LeagueService.leagues.get(1).getLeagueName(), TeamService.teams.get(3).getTteamId(),
						TeamService.teams.get(3).getTeamName(), 3));

	}

	public void initStandingMapping() {
		int sid =1;
		standingMaping.put("1_1_1", new StandingMapping(standings.get(sid).getId(), 
				standings.get(sid).getLeagueId(), standings.get(sid).getCountrrId(), standings.get(sid).getTeamId()));
		sid=2;
		standingMaping.put("1_2_2", new StandingMapping(standings.get(sid).getId(), 
				standings.get(sid).getLeagueId(), standings.get(sid).getCountrrId(), standings.get(sid).getTeamId()));
		
		sid=3;
		standingMaping.put("1_3_3", new StandingMapping(standings.get(sid).getId(), 
				standings.get(sid).getLeagueId(), standings.get(sid).getCountrrId(), standings.get(sid).getTeamId()));
		
	}
}
