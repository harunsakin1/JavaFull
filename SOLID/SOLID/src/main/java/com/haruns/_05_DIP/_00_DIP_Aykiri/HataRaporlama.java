package com.haruns._05_DIP._00_DIP_Aykiri;

// Yüksek seviye sınıf
public class HataRaporlama{
	private OracleDatabase oracleDatabase;
	
	public HataRaporlama() {
		this.oracleDatabase = new OracleDatabase();
	}
	public void hataRaporla(Exception e){
		oracleDatabase.add(e);
	}
}