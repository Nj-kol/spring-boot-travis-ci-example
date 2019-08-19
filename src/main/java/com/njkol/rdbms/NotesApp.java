package com.njkol.rdbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NotesApp {

	public static void main(String[] args) {
		SpringApplication.run(NotesApp.class, args);
	}
}
