package com.league.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }, scanBasePackages = { "com.league" })
//@EnableJpaRepositories("league.repositories")
@EntityScan("league.entity")
public class LeagueApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeagueApplication.class, args);
		// this does not need if there is DB
		initApplicationData();
	}

	private static void initApplicationData() {
		LoadApplicationData.initApplicationSeedData();
	}
}