package com.league.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.league.dtos.ResponseDto;
import com.league.dtos.StandingDto;
import com.league.entity.Standing;
import com.league.exception.StandingException;
import com.league.mapper.StandingMapper;
import com.league.service.StandingServce;

@RestController
@RequestMapping("/league/v1")
public class StandingController {

	@Autowired
	private StandingServce standingService;
	@Autowired
	private StandingMapper standingMapper;

	@GetMapping(path = "standing/{leagueName}/{countryName}/{teamName}", produces = "application/json")
	public ResponseEntity<ResponseDto> getStanding(@PathVariable String leagueName, @PathVariable String countryName,
			@PathVariable String teamName) {
		try {
			Standing standing = standingService.getStanding(leagueName, countryName, teamName);
			if (standing != null) {
				return ResponseEntity.ok().body(StandingMapper.mapper.map(standing, StandingDto.class));
			}

			return ResponseEntity.ok().body(new ResponseDto("No Standing configured ..."));
		} catch (StandingException e) {
			String msg = "Encountered error while getting Standing. Please contact to team.";
			if (!e.getMessage().isEmpty()) {
				msg = e.getMessage();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseDto(msg));
		} catch (Exception e) {
			String msg = "Encountered error while getting Standing. Please contact to team.";
			if (!e.getCause().getLocalizedMessage().isEmpty()) {
				msg = e.getMessage();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseDto(msg));
		}

	}

	@GetMapping("hello")
	public ResponseEntity<String> hellowWorld() {
		try {
			return ResponseEntity.ok().body("HelllloWorld");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
