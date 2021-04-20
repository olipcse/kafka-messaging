package com.kafka.olip.kafkajava.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;

public class MyTopicConsumer {
	private final List<String> messages = new ArrayList<>();
	@KafkaListener(topics="myTopic",groupId = "kafka-metamorphosis")
	public void listen(String message) {
		synchronized (messages) {
			messages.add(message);
		}
		
		
	}
	
	public List<String> getMessages(){
		return messages;
	}
	
	
}
