package com.haruns._02_OCP._02_OCP_Aykiri;

public class RaporOlusturucu {
	public void raporOlustur(String raporTip){
		switch (raporTip){
			case "PDF":
				System.out.println("PDF Rapor olusturuldu.");
				break;
			case "Word":
				System.out.println("Word Rapor olusturuldu.");
				break;
			case "Excel":
				System.out.println("Excel Rapor olusturuldu.");
				break;
			default:
				System.out.println("Rapor tip yanlış girildi.");
		}
	}
}