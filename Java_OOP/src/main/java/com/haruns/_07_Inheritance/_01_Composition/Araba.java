package com.haruns._07_Inheritance._01_Composition;
//Araba sinifi compound siniftir.(composition)
// Bu iliski turunde (composition) iki sinif birbirine cok siki baglidirlar.
// Her iki nesne de birlikte uretilirler.
// Araba nesnesi, motor nesnesi olmadan var olamaz.
public class Araba {
	private Motor motor;
	private String marka;
	
	public Araba(String tip, String marka){
		this.motor=new Motor(tip);
		this.marka=marka;
	}
	
	public void arabaBilgisi(){
		System.out.println("Arabanin markasi : "+marka);
		System.out.println("Motor tipi : "+motor.getTip());
	}
}