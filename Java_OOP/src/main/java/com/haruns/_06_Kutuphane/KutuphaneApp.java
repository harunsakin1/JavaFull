package com.haruns._06_Kutuphane;

public class KutuphaneApp {
	public static void main(String[] args) {
		Kutuphane kutuphane1=new Kutuphane();
		Kitap kitap1=new Kitap("9786059681001","The Little Prince","Hikaye",120,"Antoine De Saint Exupery","Karbon Kitaplar","2016");
		kutuphane1.kitapEkle(kitap1);
		kutuphane1.kitapEkle(kitap1);
		Kitap kitap2=new Kitap("9786059682021","Moby Dick","Roman",496,"Herman Malville","Kapra Yayincilik","2024");
		kutuphane1.kitapEkle(kitap2);
		
		Kitap kitap3=new Kitap("9786059680606","Kuyucakli Yusuf","Roman",288,"Sabahattin Ali","Okyanus Yayinevi", "2018");
		kutuphane1.kitapEkle(kitap3);
		
		
		kutuphane1.kitapListele();
		Uye uye1=new Uye("Harun","SAKIN","05380885993","13.12.2000","Bursa","25279452152","18.07.2024");
		Uye uye2=new Uye("Ali","Tas","05322102020","11.07.1987","Istanbul","12345678910","16.07.2023");
		kutuphane1.uyeEkle(uye1);
		kutuphane1.uyeEkle(uye1);
		kutuphane1.uyeEkle(uye2);
		kutuphane1.uyeListele();
		
		kutuphane1.oduncVer("9786059682021","25279452152");
		System.out.println("\n");
		kutuphane1.oduncVer("9786059681001","25279452152");
		System.out.println("\n");
		kutuphane1.oduncVer("9786059680606","25279452152");
		
		
	}
}