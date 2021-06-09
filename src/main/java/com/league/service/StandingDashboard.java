package com.league.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.league.entity.Standing;
import com.league.entity.StandingMapping;
import com.league.repositories.StandingRepository;

@Service
public class StandingDashboard {

	// here other cache can be used loke redis/ elastic cache
	// every time we update the db this will be updated
	private static Map<String, StandingMapping> standingMaping = new HashMap<String, StandingMapping>();

	public Integer getLinkedStandingId(String mappingId) {
		// TODO Auto-generated method stub
		return standingMaping.get(mappingId).getLinkedStanding();
	}

	public Standing getStanding(int standingId) {
		return StandingRepository.standings.get(standingId);

	}

	public static void initStandingMapping() {
		int sid = 1;
		standingMaping.put("1_1_1",
				new StandingMapping(StandingRepository.standings.get(sid).getId(),
						StandingRepository.standings.get(sid).getLeagueId(),
						StandingRepository.standings.get(sid).getCountrrId(),
						StandingRepository.standings.get(sid).getTeamId()));
		sid = 2;
		standingMaping.put("1_2_2",
				new StandingMapping(StandingRepository.standings.get(sid).getId(),
						StandingRepository.standings.get(sid).getLeagueId(),
						StandingRepository.standings.get(sid).getCountrrId(),
						StandingRepository.standings.get(sid).getTeamId()));

		sid = 3;
		standingMaping.put("1_3_3",
				new StandingMapping(StandingRepository.standings.get(sid).getId(),
						StandingRepository.standings.get(sid).getLeagueId(),
						StandingRepository.standings.get(sid).getCountrrId(),
						StandingRepository.standings.get(sid).getTeamId()));

	}
}
