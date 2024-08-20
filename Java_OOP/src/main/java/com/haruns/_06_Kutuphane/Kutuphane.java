package com.haruns._06_Kutuphane;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
	private static final int KITAP_KAPASITESI = 200;
	private static final int UYE_KAPASITESI = 50;
	private static final int ODUNC_KAPASITESI = 400;
	private static final int ODUNC_SURESI = 15; // 15 gun icinde iade etmeli
	private static final int CEZA_PUANI = 1; // geciktirilen her gun icin dusulecek puan
	
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
		kitaplar = new Kitap[KITAP_KAPASITESI];
		uyeler = new Uye[UYE_KAPASITESI];
		oduncListesi = new Odunc[ODUNC_KAPASITESI];
	}
	
	public boolean kitapEkle(Kitap eklenecekKitap) {
		if (kitapSayisi < KITAP_KAPASITESI) {
			int varOlankitapIndex = kitapBul(eklenecekKitap);
			if (varOlankitapIndex != -1) {
				// Daha once o kitap eklendiyse
				kitaplar[varOlankitapIndex].setAdet(kitaplar[varOlankitapIndex].getAdet() + 1);
				kitaplar[varOlankitapIndex].setStok(kitaplar[varOlankitapIndex].getStok() + 1);
				kitapSayisi++;
				System.out.println(eklenecekKitap.getAd() + " adli kitabin adet degeri 1 arttirildi. Kutuphanedeki " +
						                   "toplam kitap sayisi :" + kitapSayisi);
			}
			else {
				// Ilk defa eklenecek kitap
				kitaplar[kitapIndex] = eklenecekKitap;
				kitapSayisi++;
				kitapIndex++;
				System.out.println(eklenecekKitap.getAd() + " adli kitap kutuphaneye eklendi. Kutuphanedeki toplam " +
						                   "kitap sayisi : " + kitapSayisi);
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
	 * @param eklenecekKitap
	 * @return aradigimiz ISBN bulunursa, bulundugu indexi; Aradigimiz ISBN dizide bulunamazsa -1 donecek.
	 */
	public int kitapBul(Kitap eklenecekKitap) {
		for (int i = 0; i < kitapIndex; i++) {
			if (kitaplar[i].getISBN().equals(eklenecekKitap.getISBN())) {
				return i;
			}
		}
		return -1;
	}
	
	public void kitapListele() {
		System.out.println("-----------KUTUPHANE KITAP LISTESI-----------");
		if (kitapIndex == 0) {
			System.out.println("Kutuphane Bos");
		}
		else {
			for (int i = 0; i < kitapIndex; i++) {
				System.out.println(kitaplar[i]);
			}
		}
		System.out.println("----------------------------------------------");
	}
	
	public boolean uyeEkle(Uye eklenecekUye) {
		if (uyeSayisi < UYE_KAPASITESI) {
			if (uyeMi(eklenecekUye)) {
				System.out.println(eklenecekUye.getAd() + " adli kisi daha once bu tc ile uye oldugu icin kayit " +
						                   "edilemiyor.");
				return false;
			}
			else {
				uyeler[uyeSayisi] = eklenecekUye;
				uyeSayisi++;
				System.out.println(eklenecekUye.getAd() + " isimli uye kutuphaneye eklendi");
				return true;
			}
		}
		else {
			System.out.println("UYE KAPASITESI DOLU!");
			return false;
		}
		
	}
	
	public boolean uyeMi(Uye eklenecekUye) {
		for (int i = 0; i < uyeSayisi; i++) {
			if (uyeler[i].getTcNo().equals(eklenecekUye.getTcNo())) {
				return true;
			}
		}
		return false;
	}
	
	public void uyeListele() {
		System.out.println("-----------KUTUPHANE UYE LISTESI-----------");
		if (uyeSayisi == 0) {
			System.out.println("Uye Listesi Bos");
		}
		else {
			for (int i = 0; i < uyeSayisi; i++) {
				System.out.println(uyeler[i]);
			}
		}
		System.out.println("----------------------------------------------");
	}
	
	/*public void uyeSil(Uye silinecekUyeTcNo){
		if (uyeMi(silinecekUyeTcNo)){
			Uye[]temp=new Uye[][uyeSayisi-1];
			for (int i = 0; i < temp.length; i++) {
				if(uyeler[i].getTcNo().equals(silinecekUyeTcNo)){
					temp[i] = uyeler[i];
				}
				else {
				temp[i]=uyeler[i+1];
				}
				uyeler=temp;
				uyeSayisi--;
			}
			
		}
		else {
			System.out.println("Boyle bir uye zaten yok !");
		}
	}*/
	public void oduncVer(String ISBN, String tcNo) {
		int bulunanKitapIndex = kitapBul(ISBN);
		int bulunanUyeIndex = uyeBul(tcNo);
		if (bulunanKitapIndex == -1 || bulunanUyeIndex == -1) {
			System.out.println("Kitap veya uye bulunamadi. Degerleri kontrol ediniz.");
			return; // Eger uye veya kitap bulunamazsa oduncVer metodu burada sonlanir.
		}
		//System.out.println("Kitap Index : "+bulunanKitapIndex+" Uye Index : "+bulunanUyeIndex);
		
		Kitap oduncVerilecekKitap = kitaplar[bulunanKitapIndex];
		Uye oduncAlacakUye = uyeler[bulunanUyeIndex];
		
		if (oduncVerilecekKitap.getAdet() <= 0) {
			System.out.println("Bu kitap mevcut degil. Odunc verilemez");
			return;
		}
		if (oduncAlacakUye.getOduncAldigiKitapSayisi() >= 2) {
			System.out.println(oduncAlacakUye.getAd() + " adli uye 2 tane kitap odunc almistir. Daha fazla odunc kitap" +
					                   " alamaz");
			return;
		}
		if (oduncSayisi >= ODUNC_KAPASITESI) {
			System.out.println("Odunc Listesi Dolu!");
			return;
		}
		Odunc yeniOdunc = new Odunc(oduncAlacakUye, oduncVerilecekKitap, LocalDate.now().toString());
		oduncListesi[oduncSayisi] = yeniOdunc;
		oduncSayisi++;
		oduncVerilecekKitap.setAdet(oduncVerilecekKitap.getAdet() - 1);
		oduncAlacakUye.setOduncAldigiKitapSayisi(oduncAlacakUye.getOduncAldigiKitapSayisi() + 1);
		System.out.println(oduncAlacakUye.getAd() + " adli uyeye " + oduncVerilecekKitap.getAd() + " isimli kitap " +
				                   "odunc verilmistir.");
		
		System.out.println(oduncAlacakUye.getAd() + " adli uyenin aldigi kitap sayisi : " + oduncAlacakUye.getOduncAldigiKitapSayisi());
		System.out.println(oduncVerilecekKitap.getAd() + " adli kitaptan " + oduncVerilecekKitap.getAdet() + " adet " +
				                   "kalmistir");
	}
	
	public int kitapBul(String ISBN) {
		for (int i = 0; i < kitapIndex; i++) {
			if (kitaplar[i].getISBN().equals(ISBN)) {
				return i;
			}
		}
		return -1;
	}
	
	public int uyeBul(String tcNo) {
		for (int i = 0; i < uyeSayisi; i++) {
			if (uyeler[i].getTcNo().equals(tcNo)) {
				return i;
			}
		}
		return -1;
	}
	
	public void oduncListele() {
		System.out.println("-----------KUTUPHANE ODUNC LISTESI-----------");
		if (oduncSayisi == 0) {
			System.out.println("Odunc Listesi Bos");
		}
		else {
			for (int i = 0; i < oduncSayisi; i++) {
				System.out.println(oduncListesi[i]);
			}
		}
		System.out.println("----------------------------------------------");
	}
	
	public void teslimAl(int oduncNo) {
		if (oduncNo <= 0 || oduncNo > oduncSayisi || oduncListesi[oduncNo-1]==null) {
			System.out.println("Odunc no gecersizdir");
			return;
		}
		Odunc odunc=oduncListesi[oduncNo-1];
		System.out.println(odunc);
		
		if (odunc.getTeslimTarihi()!=null){
			System.out.println("Bu kitap zaten teslim alinmis. Isleme devam edilemiyor");
			return;
		}
		
		// Teslim tarihi set edelim:
		LocalDate teslimTarihi=LocalDate.now();
		odunc.setTeslimTarihi(teslimTarihi.toString());
		
		// teslimEdilenKitap adet bilgisini 1 arttır:
		Kitap teslimEdilenKitap=odunc.getKitap();
		teslimEdilenKitap.setAdet(teslimEdilenKitap.getAdet()+1);
		
		// kitapTeslimEdenUye'nin odunc aldigi kitap sayisini 1 azalt
		Uye kitapTeslimEdenUye = odunc.getUye();
		kitapTeslimEdenUye.setOduncAldigiKitapSayisi(kitapTeslimEdenUye.getOduncAldigiKitapSayisi()-1);
		
		
		
		LocalDate oduncAlmaTarihi=LocalDate.parse(odunc.getOduncAlmaTarihi());  // String bir tarihi LocalDate'e
		// cevirdik.
		long uyedeKalmaSuresi = ChronoUnit.DAYS.between(oduncAlmaTarihi, teslimTarihi);
		
		// Eger uye gecikmeli teslim ettiyse her gecen gun basina 1 puan eksiltiyoruz.
		// Uyenin puani 0'a duserse bir daha odunc kitap alamaz.
		if (uyedeKalmaSuresi>ODUNC_SURESI){
			long gecikmeSuresi=uyedeKalmaSuresi-ODUNC_SURESI;
			int dusulecekPuan=(int)(gecikmeSuresi*CEZA_PUANI);
			kitapTeslimEdenUye.setPuan(kitapTeslimEdenUye.getPuan()-dusulecekPuan);
			System.out.println("Teslim suresi "+gecikmeSuresi+" gun gecikmistir. Uyeden "+dusulecekPuan+" kadar puan " +
					                   "dusulmustur. Uyenin yeni puani :"+kitapTeslimEdenUye.getPuan());
			
		}
		// Eger uye normal tarihinde teslim ederse, 1 puan artirabiliriz.
		// toplam puan 150 olursa teslimSuresi 2 katina cikabilir
		// toplam puan 200 olursa alabilecegiKitapSayisi 2 katina cikabilir
		System.out.println(kitapTeslimEdenUye.getAd()+" adli uye "+teslimEdilenKitap+" adli kitabi teslim etmistir");
	}
	//1-> stokta 2 kitap varken 1 tanesi odunc ise o silinebilir
	//2-> ama 2si de odunc ise silinemez
	//3-> odunc listesinde olan kitap silinemez
	//4-> eger kitabin stok 1'den fazla ise hem stok bilgisini hem de adet bilgisini 1 azaltalim
	//5-> eger kitap stok 1 tane ise kitabi arrayden silmeliyiz
	public void kitapSil(String ISBN){
		int silinecekKitapIndex=kitapBul(ISBN);
		if (silinecekKitapIndex==-1){
			System.out.println("Gecersiz ISBN no veya bu ISBN no'lu kitap yok");
			return;
		}
		Kitap silinecekKitap = kitaplar[silinecekKitapIndex];
		
		if (silinecekKitap.getAdet()==0) {
			System.out.println("Tum kitaplar odunc verilmis durumda oldugu icin silme islemine devam edilemiyor.");
			return;
		}
		if (silinecekKitap.getStok()==1){
			if (silinecekKitapIndex==kitapIndex-1){
				System.out.println(silinecekKitap.getAd()+" adli kitap silindi.");
				kitaplar[kitapIndex-1]=null;
				kitapSayisi--;
				kitapIndex--;
				return;
			}
			for (int i = silinecekKitapIndex; i <kitapIndex ; i++) {
				kitaplar[i]=kitaplar[i+1];
			}
			kitaplar[kitapIndex-1]=null;
			kitapSayisi--;
			kitapIndex--;
			System.out.println(silinecekKitap.getAd()+" adli kitap silindi.");
			return;
		}
		if (silinecekKitap.getStok()>1){
			silinecekKitap.setStok(silinecekKitap.getStok()-1);
			silinecekKitap.setAdet(silinecekKitap.getAdet()-1);
			System.out.println(silinecekKitap.getAd()+" adli kitabin adeti 1 azaltildi.");
		}
	}
	// uyeSil uye uzerinde kitap varsa silinmez
	
	public void uyeSil(String tcNo){
		int silinecekUyeIndex=uyeBul(tcNo);
		if(silinecekUyeIndex==-1){
			System.out.println("Geçersiz TC no veya bu TC nolu uye yok.");
			return;
		}
		Uye silinecekUye=uyeler[silinecekUyeIndex];
		if (silinecekUye.getOduncAldigiKitapSayisi()==0){
			if(silinecekUyeIndex==uyeSayisi-1){
				System.out.println(silinecekUye.getAd() + " adlı uye silindi.");
				uyeler[uyeSayisi-1]=null;
				uyeSayisi--;
				return;
			}
			else {
				// eğer silinecek kitap uye veya başta ise yapılacaklar:
				// 1 2 3 4 5 6 7
				for (int i = silinecekUyeIndex; i < uyeSayisi; i++) {
					uyeler[i] = uyeler[i + 1];
				}
				uyeler[uyeSayisi - 1] = null;
				uyeSayisi--;
				System.out.println(silinecekUye.getAd() + " adlı uye silindi.");
				return;
			}
		}
	}
	//kitapAra
	public  Kitap[] kitapAra(String kitapAdi){
		boolean kitapVarMi=false;
		if (kitapSayisi==0){
			System.out.println("KUTUPHANE BOS");
		}
		for (int i = 0; i < kitapIndex; i++) {
			if (kitaplar[i].getAd().equals(kitapAdi)){
				System.out.println(kitaplar[i].toString());
				kitapVarMi=true;
			}
		}
		if (!kitapVarMi){
			System.out.println("KITAP BULUNAMADI");
		}
		System.out.println("-------------------------------------------------------");
		return kitaplar;
	}
	// uyeAra
	public Uye[] uyeAra(String uyeAdi){
		boolean uyeVarMi=false;
		if (uyeSayisi==0){
			System.out.println("UYE LISTESI BOS");
		}
		for (int i = 0; i < uyeSayisi; i++) {
			if (uyeler[i].getAd().equals(uyeAdi)){
				System.out.println(uyeler[i].toString());
				uyeVarMi=true;
			}
		}
		if (!uyeVarMi){
			System.out.println("UYE BULUNAMADI");
		}
		System.out.println("-------------------------------------------------------");
		return uyeler;
	}
	
	// uyedekiKitaplar: teslimTarihi == null olan odunc listesinde odunclerin icinde uye bilgisinin tc'si, aranan tc
	// ile eslesiyorsa o oduncteki kitap bilgisi yazdirilacak
	
	public void uyedekiKitaplar(String uyeAdi){
		boolean uyedeKitapVarMi=false;
		for (int i = 0; i < oduncSayisi; i++) {
			if (oduncListesi[i].getUye().getAd().equals(uyeAdi)){
				System.out.println(oduncListesi[i].getUye().getAd()+" isimli uyedeki odunc kitap : "+oduncListesi[i].getKitap().getAd().toString());
				uyedeKitapVarMi=true;
			}
		}
		if (!uyedeKitapVarMi){
			System.out.println("UYEDE ODUNC KITAP YOK.");
		}
		System.out.println("-------------------------------------------------------");
	}
	
	// uyeninAldigiTumKitaplar: odunc listesinde odunclerin icinde uye bilgisinin tc'si, aranan tc
	//	ile eslesiyorsa o oduncteki kitap bilgisi yazdirilacak
}