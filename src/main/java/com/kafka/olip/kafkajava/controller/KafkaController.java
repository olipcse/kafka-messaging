package com.kafka.olip.kafkajava.controller;

import java.util.List;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.olip.kafkajava.consumer.MyTopicConsumer;

@RestController
public class KafkaController {
	

private KafkaTemplate<String, String> template;
private MyTopicConsumer myTopicConsumer;
public KafkaController(KafkaTemplate<String, String> template, MyTopicConsumer myTopicConsumer) {
	this.template = template;
	this.myTopicConsumer=myTopicConsumer;
}
@GetMapping("/kafka/produce")
public void produce(@RequestParam String message) {
	template.send("myTopic",message);
}
@GetMapping("/kafka/hello")
public void hello() {
	System.out.println("hello kafka");
//	System.out.println(env.getProperty(KAFKA_BROKER)+"env");
}
@GetMapping("/kafka/message")
public List<String> getMessages(){
	return myTopicConsumer.getMessages();
}
}
