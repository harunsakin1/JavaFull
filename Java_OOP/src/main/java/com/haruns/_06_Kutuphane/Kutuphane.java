package com.haruns._06_Kutuphane;

import java.time.LocalDate;

/*
kitaplar
uyeler
oduncListesi

kitapSayisi
uyeSayisi
oduncSayisi

oduncSuresi
gecikmeGunBasinaDusulecekPuan

 */
public class Kutuphane {
	
	//SINIF DEGISKENLERI:Bu siniftan uretilen tum Kutuphaneler ayni kapasitelerle uretilecektir.
	private static final int KITAP_KAPASITESI=200;
	private static final int UYE_KAPASITESI=50;
	private static final int ODUNC_KAPASITESI=400;
	
	//NESNE DEGISKENLERI
	private Kitap[] kitaplar;
	private Uye[] uyeler;
	private Odunc[] oduncListesi;
	
	private int kitapSayisi;
	private int kitapIndex;
	
	private int uyeSayisi;
	
	private int oduncSayisi;
	
	//CONSTRUCTOR METHOD
	public Kutuphane() {
		//Constructor ile nesne degiskeni olan dizileri initialize etmeliyiz.
		kitaplar=new Kitap[KITAP_KAPASITESI];
		uyeler=new Uye[UYE_KAPASITESI];
		oduncListesi=new Odunc[ODUNC_KAPASITESI];
	}
	
	public boolean kitapEkle(Kitap eklenecekKitap){
		if (kitapSayisi<KITAP_KAPASITESI){
			int varOlankitapIndex=kitapVarMi(eklenecekKitap);
			if (varOlankitapIndex!=-1){
			// Daha once o kitap eklendiyse
				kitaplar[varOlankitapIndex].setAdet(kitaplar[varOlankitapIndex].getAdet()+1);
				kitapSayisi++;
				System.out.println(eklenecekKitap.getAd()+" adli kitabin adet degeri 1 arttirildi. Kutuphanedeki toplam kitap sayisi :"+kitapSayisi);
			}
			else {
				// Ilk defa eklenecek kitap
				kitaplar[kitapIndex]=eklenecekKitap;
				kitapSayisi++;
				kitapIndex++;
				System.out.println(eklenecekKitap.getAd()+" adli kitap kutuphaneye eklendi. Kutuphanedeki toplam kitap sayisi : "+kitapSayisi);
			}
			return true;
		}
		else {
			//Yeni kitap kapasiteden dolayi eklenemedi.
			System.out.println("KUTUPHANE DOLU! YENI KITAP EKLENEMIYOR!");
			return false;
		}
	}
	
	/**
	 *
	 * @param eklenecekKitap
	 * @return aradigimiz ISBN bulunursa, bulundugu indexi; Aradigimiz ISBN dizide bulunamazsa -1 donecek.
	 */
	public int kitapVarMi(Kitap eklenecekKitap){
		for (int i = 0; i < kitapIndex; i++) {
			if (kitaplar[i].getISBN().equals(eklenecekKitap.getISBN())){
				return i;
			}
		}
		return -1;
	}
	
	public void kitapListele(){
		System.out.println("-----------KUTUPHANE KITAP LISTESI-----------");
		if (kitapIndex==0){
			System.out.println("Kutuphane Bos");
		}
		else {
			for (int i = 0; i < kitapIndex; i++) {
				System.out.println(kitaplar[i]);
			}
		}
		System.out.println("----------------------------------------------");
	}
	
	public boolean uyeEkle(Uye eklenecekUye){
		if (uyeSayisi<UYE_KAPASITESI){
			if (uyeMi(eklenecekUye)){
				System.out.println(eklenecekUye.getAd()+" adli kisi daha once bu tc ile uye oldugu icin kayit edilemiyor.");
				return false;
			}
			else {
				uyeler[uyeSayisi]=eklenecekUye;
				uyeSayisi++;
				System.out.println(eklenecekUye.getAd()+" isimli uye kutuphaneye eklendi");
				return true;
			}
		}
		else {
			System.out.println("UYE KAPASITESI DOLU!");
			return false;
		}
		
	}
	public boolean uyeMi(Uye eklenecekUye){
		for (int i = 0; i < uyeSayisi; i++) {
			if (uyeler[i].getTcNo().equals(eklenecekUye.getTcNo())){
				return true;
			}
		}
		return false;
	}
	
	public void uyeListele(){
		System.out.println("-----------KUTUPHANE UYE LISTESI-----------");
		if (uyeSayisi==0){
			System.out.println("Uye Listesi Bos");
		}
		else {
			for (int i = 0; i < uyeSayisi; i++) {
				System.out.println(uyeler[i]);
			}
		}
		System.out.println("----------------------------------------------");
	}
	
//	public void uyeSil(Uye silinecekUyeTcNo){
//		if (uyeMi(silinecekUyeTcNo)){
//			int[]temp=new int[uyeSayisi-1];
//			if ()
//		}
//		else {
//			System.out.println("Boyle bir uye zaten yok !");
//		}
//	}
		public void oduncVer(String ISBN, String tcNo){
			int bulunanKitapIndex=kitapBul(ISBN);
			int bulunanUyeIndex=uyeBul(tcNo);
			if (bulunanKitapIndex==-1||bulunanUyeIndex==-1){
				System.out.println("Kitap veya uye bulunamadi. Degerleri kontrol ediniz.");
				return; // Eger uye veya kitap bulunamazsa oduncVer metodu burada sonlanir.
			}
			//System.out.println("Kitap Index : "+bulunanKitapIndex+" Uye Index : "+bulunanUyeIndex);
			
			Kitap oduncVerilecekKitap = kitaplar[bulunanKitapIndex];
			Uye oduncAlacakUye = uyeler[bulunanUyeIndex];
			
			if (oduncVerilecekKitap.getAdet()<=0){
				System.out.println("Bu kitap mevcut degil. Odunc verilemez");
				return;
			}
			if (oduncAlacakUye.getOduncAldigiKitapSayisi()>=2){
				System.out.println(oduncAlacakUye.getAd()+" adli uye 2 tane kitap odunc almistir. Daha fazla odunc kitap alamaz");
				return;
			}
			if(oduncSayisi>=ODUNC_KAPASITESI){
				System.out.println("Odunc Listesi Dolu!");
				return;
			}
			Odunc yeniOdunc=new Odunc(oduncAlacakUye,oduncVerilecekKitap, LocalDate.now().toString());
			oduncListesi[oduncSayisi]=yeniOdunc;
			oduncSayisi++;
			oduncVerilecekKitap.setAdet(oduncVerilecekKitap.getAdet()-1);
			oduncAlacakUye.setOduncAldigiKitapSayisi(oduncAlacakUye.getOduncAldigiKitapSayisi()+1);
			System.out.println(oduncAlacakUye.getAd()+" adli uyeye "+oduncVerilecekKitap.getAd()+" isimli kitap odunc verilmistir.");
			
			System.out.println(oduncAlacakUye.getAd()+" adli uyenin aldigi kitap sayisi : "+oduncAlacakUye.getOduncAldigiKitapSayisi());
			System.out.println(oduncVerilecekKitap.getAd()+" adli kitaptan "+oduncVerilecekKitap.getAdet()+" adet kalmistir");
		}
		public int kitapBul(String ISBN){
			for (int i = 0; i < kitapIndex; i++) {
				if (kitaplar[i].getISBN().equals(ISBN)){
					return i;
				}
			}
			return -1;
		}
		public int uyeBul(String tcNo){
			for (int i = 0; i < uyeSayisi; i++) {
				if(uyeler[i].getTcNo().equals(tcNo)){
					return i;
				}
			}
			return -1;
		}
}