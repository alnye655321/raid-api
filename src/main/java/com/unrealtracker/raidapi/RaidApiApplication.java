package com.unrealtracker.raidapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RaidApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaidApiApplication.class, args);
	}

}

