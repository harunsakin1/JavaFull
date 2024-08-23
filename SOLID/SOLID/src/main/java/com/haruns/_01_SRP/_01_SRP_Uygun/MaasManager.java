package com.haruns._01_SRP._01_SRP_Uygun;

public class MaasManager {
	public void maasHesapla(Calisan calisan){
		double vergi =calisan.getBrutMaas()* 0.2;
		double netMaas= calisan.getBrutMaas()-vergi;
		System.out.println(calisan.getAd()+" adlı çalışanın net maaşı : "+netMaas);
	}
}