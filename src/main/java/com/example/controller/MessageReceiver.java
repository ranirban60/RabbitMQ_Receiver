package com.example.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.configuration.RabbitMQConfigure;
import com.example.model.CustomMessage;

@Component
public class MessageReceiver {

	@RabbitListener(queues = RabbitMQConfigure.QUEUE)
	public void receiver(CustomMessage customMessage) {
		System.out.println(customMessage);
	}
}
