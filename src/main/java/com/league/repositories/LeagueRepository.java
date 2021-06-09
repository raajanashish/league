package com.league.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.league.entity.League;
@Service
public class LeagueRepository implements Repository {
	// Here data will come from db.
	public static Map<Integer, League> leagues = new HashMap<Integer, League>();

	public static void initLeagueData() {
		leagues.put(1, new League(1, "SummerTrack"));
		leagues.put(2, new League(2, "Winter-track"));

	}
}
