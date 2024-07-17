package com.haruns._05_OtoGaleri;

public class OtoGaleri {

	// Nesne degiskenleri :
	private  OtoGaleriAraba[] arabalar;
	private int galeridekiArabaSayisi;
	
	private String ad;
	private String tel;
	private String yetkiliKisi;
	
	public OtoGaleri(int kapasite) {
		this.arabalar = new OtoGaleriAraba[kapasite];
		
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getYetkiliKisi() {
		return yetkiliKisi;
	}
	
	public void setYetkiliKisi(String yetkiliKisi) {
		this.yetkiliKisi = yetkiliKisi;
	}
	
	public void arabaEkle(OtoGaleriAraba araba) {
		if (galeridekiArabaSayisi<arabalar.length){
		arabalar[galeridekiArabaSayisi]=araba;
		this.galeridekiArabaSayisi++;
		}
		else {
			System.out.println("Galeri Dolu! Arac Eklenemedi.");
			
		}
	}
	
	public void arabaListele() {
//		for (int i = 0; i <galeridekiArabaSayisi ; i++) {
//			System.out.println(arabalar[i]);
//		}
		for (OtoGaleriAraba araba:arabalar){
			if (araba!=null){
				System.out.println(araba);
			}
		}
	}
	
	@Override
	public String toString() {
		return "OtoGaleri{" + "ad='" + getAd() + '\'' + ", tel='" + getTel() + '\'' + ", yetkiliKisi='" + getYetkiliKisi() + '\'' + '}';
	}
}