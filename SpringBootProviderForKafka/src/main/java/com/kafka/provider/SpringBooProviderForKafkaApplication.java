package com.kafka.provider;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBooProviderForKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBooProviderForKafkaApplication.class, args);
	}

	/*@Bean
	CommandLineRunner init(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("SpringTopic-one", "Hola Mundo con Kafka desde Spring Boot");
		};
	}*/
}
