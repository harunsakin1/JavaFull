package com.haruns._04_Encapsulation;

public class ArabaMain {
	public static void main(String[] args) {
		Araba araba1=new Araba();
		Motor motor1=new Motor();
		
		motor1.setMotorHacmi(1600);
		motor1.setBeygir(130);
		motor1.setTork(300);
		motor1.setSasiNo("A1B2C3D4");
		
		
		araba1.setHiz(50);
		araba1.setKm(10000);
		araba1.setMarka("Hyundai");
		araba1.setModel("ix35");
		araba1.setRenk("Siyah");
		araba1.setYil("2020");
		araba1.setMotor(motor1);
		
		System.out.println(araba1);
	}
}