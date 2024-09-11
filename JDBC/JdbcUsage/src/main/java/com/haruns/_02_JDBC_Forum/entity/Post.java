package com.haruns._02_JDBC_Forum.entity;

import java.time.LocalDate;

public class Post {
	private int id;
	private int user_id;
	private String baslik;
	private String icerik;
	private LocalDate paylasimTarihi;
	
	public Post() {
	}
	
	public Post(int user_id, String baslik, String icerik, LocalDate paylasimTarihi) {
		this.user_id = user_id;
		this.baslik = baslik;
		this.icerik = icerik;
		this.paylasimTarihi = paylasimTarihi;
	}
	
	public Post(int id, int user_id, String baslik, String icerik, LocalDate paylasimTarihi) {
		this.id = id;
		this.user_id = user_id;
		this.baslik = baslik;
		this.icerik = icerik;
		this.paylasimTarihi = paylasimTarihi;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getBaslik() {
		return baslik;
	}
	
	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}
	
	public String getIcerik() {
		return icerik;
	}
	
	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}
	
	public LocalDate getPaylasimTarihi() {
		return paylasimTarihi;
	}
	
	public void setPaylasimTarihi(LocalDate paylasimTarihi) {
		this.paylasimTarihi = paylasimTarihi;
	}
	
	@Override
	public String toString() {
		return "Post{" + "id=" + getId()
				+ ", user_id=" + getUser_id()
				+ ", baslik='" + getBaslik() + '\''
				+ ", icerik='" + getIcerik() + '\''
				+ ", paylasimTarihi=" + getPaylasimTarihi() + '}';
	}
}