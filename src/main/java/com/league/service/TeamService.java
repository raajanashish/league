package com.league.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.league.repositories.TeamRepository;

@Service
public class TeamService {

	public Integer getTeamId(String teamName) {
		return TeamRepository.teams.entrySet().stream().filter(entry -> entry.getValue().getTeamName().equals(teamName))
				.map(Map.Entry::getKey).findFirst().orElse(null);

	}

}
