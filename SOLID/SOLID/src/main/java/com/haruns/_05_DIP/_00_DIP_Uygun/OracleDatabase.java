package com.haruns._05_DIP._00_DIP_Uygun;

// Düşük seviye sınıf
public class OracleDatabase implements IDatabase {
	public void add(Object o){
		System.out.println("Object veritabanına eklendi.");
	}
}