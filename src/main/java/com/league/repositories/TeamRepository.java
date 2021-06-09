package com.league.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.league.entity.Team;
@Service
public class TeamRepository implements Repository {
	// Here data will come from db.
	public static Map<Integer, Team> teams = new HashMap<Integer, Team>();

	public static void initTeamData() {

		teams.put(1, new Team(1, "Atletico"));
		teams.put(2, new Team(2, "Oblak"));
		teams.put(3, new Team(3, "Champio"));
	}
}
