package com.haruns.streamOrnek;

public class Ogrenci implements Comparable<Ogrenci>{
	private Long id;
	private String ad;
	private String soyad;
	private String sehir;
	private String bolum;
	private Double not;
	
	public Long getId() {
		return id;
	}
	
	public String getAd() {
		return ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public String getBolum() {
		return bolum;
	}
	
	public Double getNot() {
		return not;
	}
	
	public String getSehir() {
		return sehir;
	}
	
	public Ogrenci(Long id, String ad, String soyad, String sehir, String bolum, Double not) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.sehir=sehir;
		this.bolum = bolum;
		this.not = not;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "id=" + getId() + ", ad='" + getAd() + '\'' + ", soyad='" + getSoyad() + '\'' + ", sehir='" + getSehir() + '\'' + ", bolum='" + getBolum() + '\'' + ", not=" + getNot() + '}';
	}
	
	@Override
	public int compareTo(Ogrenci o) {
		return Double.compare(o.getNot(),this.getNot());
	}
}