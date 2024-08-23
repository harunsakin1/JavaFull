package com.haruns._05_DIP._02_DIP_UygunMu;

public class Runner {
	public static void main(String[] args) {
		EmailSender emailSender=new EmailSender();
		SmsSender smsSender=new SmsSender();
		NotificationService notificationService=new NotificationService(smsSender);
		notificationService.sendNotification("Al bu mesajı gönder.");
	}
}