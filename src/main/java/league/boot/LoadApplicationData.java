package league.boot;

import org.springframework.stereotype.Service;

import league.service.CountryService;
import league.service.LeagueService;
import league.service.StandingDashboard;
import league.service.TeamService;

@Service
public class LoadApplicationData {

	public static void initApplicationSeedData() {
		CountryService.initCountryData();
		TeamService.initTeamData();
		LeagueService.initLeagueData();
		StandingDashboard.initStandingData();
		StandingDashboard.initStandingMapping();
	}
}
