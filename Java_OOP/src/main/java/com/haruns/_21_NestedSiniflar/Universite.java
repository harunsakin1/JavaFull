package com.haruns._21_NestedSiniflar;

import java.util.ArrayList;

/**
 * Nested sınıflar :
 * Java'da iç içe yerleştirilmiş sınıflardır.
 * Inner class'tan direkt olarak nesne oluşturamayız.
 * Inner class'tan nesne oluşturmak için önce dış sınıftan nesne oluşturmalıyız.
 * Universite universite1=new Universite("BilgeAdam");
 * Inner class'tan nesne oluşturmak için öncelikle dışSınıfAdı.içSınıfAdı yazılmalıdır.Universite.
 * Ogrenci ogrenci1= universite1.new Ogrenci("Harun",1744);
 * Inner class, üst sınıfın field ve metodlarına private olsa bile erişebilir.
 */
public class Universite {
	private String ad;
	private ArrayList<Ogrenci> ogrenciler;
	
	public Universite(String ad) {
		this.ad = ad;
		this.ogrenciler=new ArrayList<Ogrenci>();
	}
	
	public void ogrenciListele(){
		System.out.println(ad+" Universitesi Öğrenci Listesi");
		for (Ogrenci ogrenci:ogrenciler){
			System.out.println(ogrenci);
		}
	}
	
	public class Ogrenci{
		private String ad;
		private Integer ogrNo;
		
		public Ogrenci(String ad, Integer ogrNo) {
			this.ad = ad;
			this.ogrNo = ogrNo;
			ogrenciler.add(this);
		}
		
		@Override
		public String toString() {
			return "Ogrenci{" + "ad='" + ad + '\'' + ", ogrNo=" + ogrNo + '}';
		}
	}
}