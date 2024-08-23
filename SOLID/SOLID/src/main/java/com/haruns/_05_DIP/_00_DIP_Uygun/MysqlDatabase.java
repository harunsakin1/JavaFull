package com.haruns._05_DIP._00_DIP_Uygun;

public class MysqlDatabase implements IDatabase{
	public void add(Object o){
		System.out.println("Object veritabanına eklendi.");
	}
}