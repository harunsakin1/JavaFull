package com.haruns._05_OtoGaleri;

public class OtoGaleriAraba {
	private String marka;
	private String model;
	private String yil;
	private String renk;
	private int km;
	private int hiz;
	private OtoGaleriMotor motor;
	
	public OtoGaleriAraba() {
	}
	
	public OtoGaleriAraba(String marka, String model, String yil, String renk, int km, int hiz, OtoGaleriMotor motor) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.renk = renk;
		this.km = km;
		this.hiz = hiz;
		this.motor = motor;
	}
	
	
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYil() {
		return yil;
	}
	
	public void setYil(String yil) {
		this.yil = yil;
	}
	
	public String getRenk() {
		return renk;
	}
	
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	public int getHiz() {
		return hiz;
	}
	
	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	
	public OtoGaleriMotor getMotor() {
		return motor;
	}
	
	public void setMotor(OtoGaleriMotor motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return "Araba{" + "marka='" + getMarka() + '\'' + ", model='" + getModel() + '\'' + ", yil='" + getYil() + '\'' + ", renk='" + getRenk() + '\'' + ", km=" + getKm() + ", hiz=" + getHiz() + ", motor=" + getMotor() + '}';
	}
}