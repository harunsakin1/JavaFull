package com.haruns._01_JDBC_ETicaret.entity;

import java.time.LocalDate;

/**
 * Entity yazımında :
 * Entity yazarken mutlaka tabloya bakarak yaz !
 * Boş constructor ekle
 * ID'siz constructor ekle
 * Full constructor ekle
 * ToString ekle
 * Getter-Setter ekle
 */
public class Musteri extends BaseEntity {

	private Integer id;
	private String ad;
	private String soyad;
	private String cinsiyet;
	private LocalDate dtarih;
	private String tel;
	private String email;
	private String sehir;
	
	// Boş constructor
	public Musteri() {
	}
	
	// ID'siz constructor
	public Musteri(String ad, String soyad, String cinsiyet, LocalDate dtarih, String tel, String email, String sehir) {
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.dtarih = dtarih;
		this.tel = tel;
		this.email = email;
		this.sehir = sehir;
	}
	
	// Full constructor
	public Musteri(int id, String ad, String soyad, String cinsiyet, LocalDate dtarih, String tel, String email, String sehir) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.dtarih = dtarih;
		this.tel = tel;
		this.email = email;
		this.sehir = sehir;
	}
	
	public Musteri( Integer id, String ad, String soyad, String cinsiyet, LocalDate dtarih, String tel, String email, String sehir,Integer state, Long createat, Long updateat) {
		super(state, createat, updateat);
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.dtarih = dtarih;
		this.tel = tel;
		this.email = email;
		this.sehir = sehir;
	}
	
	@Override
	public String toString() {
		return "Musteri{" + "id=" + id
				+ ", ad='" + ad + '\''
				+ ", soyad='" + soyad + '\''
				+ ", cinsiyet='" + cinsiyet + '\''
				+ ", dtarih=" + dtarih
				+ ", tel='" + tel + '\''
				+ ", email='" + email + '\''
				+ ", sehir='" + sehir + '\''
				+ ", state=" + getState()
				+ ", createat=" + getCreateat()
				+ ", updateat=" + getUpdateat() + '}';
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String getCinsiyet() {
		return cinsiyet;
	}
	
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	public LocalDate getDtarih() {
		return dtarih;
	}
	
	public void setDtarih(LocalDate dtarih) {
		this.dtarih = dtarih;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSehir() {
		return sehir;
	}
	
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
}