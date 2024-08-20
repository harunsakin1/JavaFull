package com.haruns._18_EnumOrnek2;

public class RunnerColor {
	// Enum'lar runtime anında erişim sağlanırsa constructor aracılığı ile tüm field'ların oluşmasını sağlıyor.
	enum Color{
		RED,
		GREEN,
		BLUE;
		
		Color() {
			System.out.println("Color enum constructor calistir");
		}
	}
	
	public static void main(String[] args) {
		Color color1=Color.BLUE;
		System.out.println(color1.ordinal());
		System.out.println(color1);
		
		for (Color item:Color.values()){
			System.out.println("Field : "+item.name()+" Index : "+item.ordinal());
		}
	}
}