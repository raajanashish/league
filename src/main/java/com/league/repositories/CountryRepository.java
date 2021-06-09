package com.league.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.league.entity.Country;

@Service
public class CountryRepository implements Repository {// we do jot need thos if there is DB
	public static Map<Integer, Country> countries = new HashMap<Integer, Country>();

	public static void initCountryData() {
		countries.put(1, new Country(1, "England"));
		countries.put(2, new Country(2, "Spain"));
		countries.put(3, new Country(3, "France"));
	}

}
