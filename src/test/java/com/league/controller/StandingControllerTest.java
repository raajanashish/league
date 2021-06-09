package com.league.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.league.boot.LeagueApplication;
import com.league.boot.LoadApplicationData;
import com.league.dtos.StandingDto;

@SpringBootTest(classes = LeagueApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class StandingControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;
	@LocalServerPort
	private int port;

	 {
		LoadApplicationData.initApplicationSeedData();
	 }

	@Test
	public void getStanding() throws Exception {
		//LoadApplicationData.initApplicationSeedData();
		StandingDto dto = this.restTemplate.getForObject(
				"http://localhost:" + port + "/league/v1/standing/SummerTrack/England/Atletico", StandingDto.class);
		assertEquals(1, dto.getCountrrId());
		assertEquals(1, dto.getOverallLeaguePosition());
	}
	
	@Test
	public void getStanding_invalidCountry() throws Exception {
		//LoadApplicationData.initApplicationSeedData();
		StandingDto dto = this.restTemplate.getForObject(
				"http://localhost:" + port + "/league/v1/standing/SummerTrack/Eng/Atletico", StandingDto.class);
		assertEquals("Provided country name is invalid", dto.getErrorMsg());
	}
	
	@Test
	public void getStanding_invalidLeague() throws Exception {
		//LoadApplicationData.initApplicationSeedData();
		StandingDto dto = this.restTemplate.getForObject(
				"http://localhost:" + port + "/league/v1/standing/invalidleag/England/Atletico", StandingDto.class);
		assertEquals("Provided league name is invalid", dto.getErrorMsg());
	}
}
