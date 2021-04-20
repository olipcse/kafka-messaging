package com.kafka.olip.kafkajava.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
private KafkaTemplate<String, String> template;
public KafkaController(KafkaTemplate<String, String> template) {
	this.template = template;
}
@GetMapping("/kafka/produce")
public void produce(@RequestParam String message) {
	template.send("myTopic",message);
}
@GetMapping("/kafka/hello")
public void hello() {
	System.out.println("hello kafka");
}
}
