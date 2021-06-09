package league.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import league.entity.Team;

@Service
public class TeamService {
	// Here data will come from db.
	public static Map<Integer, Team> teams = new HashMap<Integer, Team>();

	public Integer getTeamId(String teamName) {
		return teams.entrySet().stream().filter(entry -> entry.getValue().getTeamName().equals(teamName))
				.map(Map.Entry::getKey).findFirst().orElse(null);

	}

	
	public void  initTeamData() {
		
		teams.put(1, new Team(1, "Atletico Madrid"));
		teams.put(2, new Team(2, "Oblak"));
		teams.put(3, new Team(3, "Champio"));
	}
}
