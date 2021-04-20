package com.kafka.olip.kafkajava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaJavaApplication {

	public static void main(String[] args) {
		System.out.println("came to end point");
		SpringApplication.run(KafkaJavaApplication.class, args);
	}

}
