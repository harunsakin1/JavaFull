package com.haruns._05_DIP._00_DIP_Uygun;

// Yüksek seviye sınıf
public class HataRaporlama{
	private IDatabase database;
	
	public HataRaporlama(IDatabase database) {
		this.database=database;
	}
	public void hataRaporla(Exception e){
		database.add(e);
	}
}