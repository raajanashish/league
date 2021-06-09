package com.league.boot;

import org.springframework.stereotype.Service;

import com.league.repositories.CountryRepository;
import com.league.repositories.LeagueRepository;
import com.league.repositories.StandingRepository;
import com.league.repositories.TeamRepository;
import com.league.service.StandingDashboard;

@Service
public class LoadApplicationData {

	public static void initApplicationSeedData() {
		CountryRepository.initCountryData();
		TeamRepository.initTeamData();
		LeagueRepository.initLeagueData();
		StandingRepository.initStandingData();
		StandingDashboard.initStandingMapping();
	}
}
