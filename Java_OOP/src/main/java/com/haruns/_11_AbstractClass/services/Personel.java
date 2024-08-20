package com.haruns._11_AbstractClass.services;
/*
Sinif final olarak tanimlanirsa o siniftan miras alinmasi engellenir.
public final class Personel extends Object {
 */
public abstract class Personel extends Object {
	public String ad;
	public String tel;
	public String tc;
	public int yas;
	private int maasKatSayisi=1;
	private int maas=17002;
	
	public int getMaasKatSayisi() {
		return maasKatSayisi;
	}
	
	public void setMaasKatSayisi(int maasKatSayisi) {
		this.maasKatSayisi = maasKatSayisi;
	}
	
	public int getMaas() {
		return maas;
	}
	
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	public Personel(String ad) {
		this.ad = ad;
		System.out.println("personel sinifi 1 parametreli constructor calisti " + ad);
	}
	
	public Personel(String ad, String tel, int maasKatSayisi) {
		this.ad = ad;
		this.tel = tel;
		this.maasKatSayisi = maasKatSayisi;
	}
	
	protected String getInfo() {
		return "Personel{" + "ad='" + ad + '\''
				+ ", tel='" + tel + '\''
				+ ", tc='" + tc + '\''
				+ ", yas=" + yas
				+ ", maasKatSayisi=" + maasKatSayisi + '}';
	}
	//Override edilmesini istedigimiz metodlar abstract olarak tanimlanmali
	public abstract void zamIste();
	//Override edilmesini istemedigimiz metodlar final olarak tanimlanmali
	public final void calis(){
		System.out.println("calisiyor...");
	}
	protected String personelProtectedMethod(){
		return "personelProtectedMethod";
	}
}