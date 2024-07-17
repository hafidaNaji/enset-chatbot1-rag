package net.naji.ensetchatbot1rag;

import net.naji.ensetchatbot1rag.entities.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class EnsetChatbot1RagApplication {


	public static void main(String[] args) {
		SpringApplication.run(EnsetChatbot1RagApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PersonRepository personRepository) {
		return args -> {
			for (int i = 0; i < 100; i++) {
				Person person = Person.builder()
						.name(UUID.randomUUID().toString().substring(0, 8))
						.email(UUID.randomUUID().toString().substring(0, 8) + "@gmail.com")
						.build();
				personRepository.save(person);
			}
		};
	}
}
