package league.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import league.dtos.StandingDto;
import league.entity.Standing;
import league.mapper.StandingMapper;
import league.service.StandingServce;

@RestController
@RequestMapping("/league/v1")
public class StandingController {

	@Autowired
	private StandingServce standingService;
	@Autowired
	private StandingMapper standingMapper;

	@GetMapping("standing/{leagueName}/{countryName}/{teamName}")
	public ResponseEntity<StandingDto> getStanding(@PathVariable String leagueName, @PathVariable String countryName,
			@PathVariable String teamName) {
		try {
			Standing standing = standingService.getStanding(leagueName, countryName, teamName);
			return ResponseEntity.ok().body(standingMapper.convertToDto(standing));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
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
