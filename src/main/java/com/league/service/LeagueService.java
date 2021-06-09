package com.league.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.league.repositories.LeagueRepository;

@Service
public class LeagueService {

	public Integer getLeaugeId(String leagueName) {
		return LeagueRepository.leagues.entrySet().stream().filter(entry -> entry.getValue().getLeagueName().equals(leagueName))
				.map(Map.Entry::getKey).findFirst().orElse(null);
	}

}
