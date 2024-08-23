package com.haruns._05_DIP._02_DIP_UygunMu;

public class EmailSender implements IMessageSender{
	@Override
	public void sendMessage(String message) {
		//Mail gönderme kodları
		System.out.println("Mail sent : "+message);
	}
}