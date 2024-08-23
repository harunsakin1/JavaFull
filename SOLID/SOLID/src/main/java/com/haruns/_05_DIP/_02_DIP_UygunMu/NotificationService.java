package com.haruns._05_DIP._02_DIP_UygunMu;

public class NotificationService {
	private IMessageSender messageSender;
	
	public NotificationService(IMessageSender MessageSender) {
		this.messageSender = MessageSender;
	}
	public void sendNotification(String message){
		messageSender.sendMessage(message);
	}
}