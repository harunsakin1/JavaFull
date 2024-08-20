package com.haruns._07_Inheritance._02_Aggregation;
/*
Aggregation : composition'daki siki baglilik yerine daha gevsek bir baglilik sunar.
Araba has a motor.
Burada bilesen ayri bir sekilde nesne olusturularak gonderilebiliyor. Bagimsiz bir sekilde olusturulabilmesi gevsek baglilik sunar.
 */
public class Runner {
	public static void main(String[] args) {
		Motor motor1=new Motor("Benzin");
		Araba araba1=new Araba("Audi",motor1);
		araba1.arabaBilgisi();
	}
	
	
}