package com.haruns._05_DIP._02_DIP_UygunMu;

public class SmsSender implements IMessageSender{
	@Override
	public void sendMessage(String message) {
		//Sms gönderme kodları
		System.out.println("Sms sent : "+message);
	}
}