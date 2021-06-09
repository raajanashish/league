package league.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import league.entity.League;

@Service
public class LeagueService {

	// Here data will come from db.
	public static Map<Integer, League> leagues = new HashMap<Integer, League>();

	public Integer getLeaugeId(String leagueName) {
		return leagues.entrySet().stream().filter(entry -> entry.getValue().getLeagueName().equals(leagueName))
				.map(Map.Entry::getKey).findFirst().orElse(null);
	}

	public static  void initLeagueData() {
		leagues.put(1, new League(1, "SummerTrack"));
		leagues.put(2, new League(2, "Winter-track"));

	}
}
