package com.haruns._01_SRP._01_SRP_Uygun;

public class Calisan {
	private String ad;
	private String id;
	private String departman;
	private Double brutMaas;
	
	public Calisan(String ad, String id, String departman, Double brutMaas) {
		this.ad = ad;
		this.id = id;
		this.departman = departman;
		this.brutMaas = brutMaas;
	}
	
	
	public String calisanBilgileriniYaz() {
		return "Calisan{" + "ad='" + ad + '\'' + ", id='" + id + '\'' + ", departman='" + departman + '\'' + ", brutMaas=" + brutMaas + '}';
	}
	
	
	
	public String getAd() {
		return ad;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDepartman() {
		return departman;
	}
	
	public Double getBrutMaas() {
		return brutMaas;
	}
}