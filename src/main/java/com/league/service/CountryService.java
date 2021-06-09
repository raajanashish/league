package com.league.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.repositories.CountryRepository;

@Service
public class CountryService {
	@Autowired
	CountryRepository countryRepository;

	public Integer getCountryId(String countryName) {
		// Here data will come from db.
		return CountryRepository.countries.entrySet().stream().filter(entry -> entry.getValue().getCountryName().equals(countryName))
				.map(Map.Entry::getKey).findFirst().orElse(null);

	}

}
