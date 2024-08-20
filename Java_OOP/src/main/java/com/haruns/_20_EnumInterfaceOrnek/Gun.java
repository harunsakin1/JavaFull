package com.haruns._20_EnumInterfaceOrnek;

public enum Gun implements Hafta {
	PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR;
	
	@Override
	public int kacinciGun() {
		System.out.print(name()+" : ");
		return ordinal()+1;
	}
}