package com.haruns.EczaneApi;

public class Pharmacy {
	private String name;
	private String address;
	private String phone;
	private String loc;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Eczane: " + name + ", Adres: " + address + ", Telefon: " + phone + ", Konum: " + loc;
	}
}