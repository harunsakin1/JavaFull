package com.haruns._27_Generics.Generic00;

import java.time.LocalDateTime;

public class RunnerPersonel {
	public static void main(String[] args) {
		Personel<String,String> p1=new Personel<>();
		p1.ad="Harun";
		p1.dogumTarihi="13Aralik";
		System.out.println(p1);
		
		Personel<String, LocalDateTime>p2=new Personel<>();
		p2.ad="Mehmet";
		p2.dogumTarihi=LocalDateTime.now();
		System.out.println(p2);
	}
}