package com.nikhil.demo;

import org.springframework.messaging.Message; //important to be imported to have spring message functionalities for message transfer
/*
 * This class has to be written ourselves to do processing on received message
 * this is actual business logic that is to be done
 */
public class ReceiverActivator {
	public void print(Message msg) {
		System.out.println("Received message is:"+msg.getPayload());
	}
}
