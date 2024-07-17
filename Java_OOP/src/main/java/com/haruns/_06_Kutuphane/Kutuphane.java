package com.haruns._06_Kutuphane;

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
	private String[] kitaplar;
	private String[] uyeler;
	private String[] oduncListesi;
	private int kitapSayisi;
	private int uyeSayisi;
	private int oduncSayisi;
	private String oduncSuresi;
	private int gecikmeGunBasinaDusulecekPuan;
	
	public Kutuphane() {
	}
	
	public Kutuphane(String[] kitaplar, String[] uyeler, String[] oduncListesi, int kitapSayisi, int uyeSayisi,
	                 int oduncSayisi, String oduncSuresi, int gecikmeGunBasinaDusulecekPuan) {
		this.kitaplar = kitaplar;
		this.uyeler = uyeler;
		this.oduncListesi = oduncListesi;
		this.kitapSayisi = kitapSayisi;
		this.uyeSayisi = uyeSayisi;
		this.oduncSayisi = oduncSayisi;
		this.oduncSuresi = oduncSuresi;
		this.gecikmeGunBasinaDusulecekPuan = gecikmeGunBasinaDusulecekPuan;
	}
	
}