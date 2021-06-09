package com.league.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.league.entity.Standing;

/**
 * Here we have to make data connection.
 * 
 * @author raajan
 *
 */
@Service
public class StandingRepository implements Repository {
	public static Map<Integer, Standing> standings = new HashMap<Integer, Standing>();

	public static void initStandingData() {
		standings.put(1,
				new Standing(1, CountryRepository.countries.get(1).getCountryId(),
						CountryRepository.countries.get(1).getCountryName(),
						LeagueRepository.leagues.get(1).getLeagueId(), LeagueRepository.leagues.get(1).getLeagueName(),
						TeamRepository.teams.get(1).getTteamId(), TeamRepository.teams.get(1).getTeamName(), 1));
		standings.put(2,
				new Standing(2, CountryRepository.countries.get(2).getCountryId(),
						CountryRepository.countries.get(2).getCountryName(),
						LeagueRepository.leagues.get(1).getLeagueId(), LeagueRepository.leagues.get(1).getLeagueName(),
						TeamRepository.teams.get(2).getTteamId(), TeamRepository.teams.get(2).getTeamName(), 2));
		standings.put(3,
				new Standing(3, CountryRepository.countries.get(3).getCountryId(),
						CountryRepository.countries.get(3).getCountryName(),
						LeagueRepository.leagues.get(1).getLeagueId(), LeagueRepository.leagues.get(1).getLeagueName(),
						TeamRepository.teams.get(3).getTteamId(), TeamRepository.teams.get(3).getTeamName(), 3));

	}
}
