package com.microservices.tarek.microservicestarek;

import com.microservices.tarek.microservicestarek.event.OrderPlacedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	@KafkaListener(topics = "notificationTopic")
	public void handleNotificaion(OrderPlacedEvent orderPlacedEvent){
		System.out.println("Notification received for order number : "+ orderPlacedEvent.getNumDemande());
	}

}
