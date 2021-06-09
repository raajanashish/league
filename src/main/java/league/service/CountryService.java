package league.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import league.entity.Country;

@Service
public class CountryService {
	// we do jot need thos if there is DB
	public static  Map<Integer, Country> countries = new HashMap<Integer, Country>();

	public Integer getCountryId(String countryName) {
		// Here data will come from db.
		return countries.entrySet().stream().filter(entry -> entry.getValue().getCountryName().equals(countryName))
				.map(Map.Entry::getKey).findFirst().orElse(null);

	}

	public static void initCountryData() {
		countries.put(1, new Country(1, "England"));
		countries.put(2, new Country(2, "Spain"));
		countries.put(3, new Country(3, "France"));
	}

}
