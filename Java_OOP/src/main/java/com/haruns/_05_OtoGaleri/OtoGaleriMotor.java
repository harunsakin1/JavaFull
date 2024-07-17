package com.haruns._05_OtoGaleri;

public class OtoGaleriMotor {
	public int motorHacmi;
	public String sasiNo;
	public int beygir;
	public int tork;
	
	public int getMotorHacmi() {
		return motorHacmi;
	}
	
	public OtoGaleriMotor(int motorHacmi, String sasiNo, int beygir, int tork) {
		this.motorHacmi = motorHacmi;
		this.sasiNo = sasiNo;
		this.beygir = beygir;
		this.tork = tork;
	}
	
	public void setMotorHacmi(int motorHacmi) {
		if (motorHacmi>800&&motorHacmi<3000) {
			this.motorHacmi = motorHacmi;
		}
		else if (motorHacmi<=800) {
			this.motorHacmi=800;
			System.out.println("800'den daha az deger girdiginiz icin motorHacmi 800 olarak degistirildi.");
		}
		else if (motorHacmi>=3000) {
			this.motorHacmi=3000;
			System.out.println("3000'den fazla deger girdiginiz icin motorHacmi 3000 olarak degistirildi.");
		}
	}
	
	public String getSasiNo() {
		return sasiNo;
	}
	
	public void setSasiNo(String sasiNo) {
		if (sasiNo.length()==8) {
			this.sasiNo = sasiNo;
		}
		else this.sasiNo="00000000";
	}
	
	public int getBeygir() {
		return beygir;
	}
	
	public void setBeygir(int beygir) {
		this.beygir = beygir;
	}
	
	public int getTork() {
		return tork;
	}
	
	public void setTork(int tork) {
		this.tork = tork;
	}
	
	@Override
	public String toString() {
		return "Motor{" + "motorHacmi=" + getMotorHacmi() + ", sasiNo='" + getSasiNo() + '\'' + ", beygir=" + getBeygir() + ", tork=" + getTork() + '}';
	}
}