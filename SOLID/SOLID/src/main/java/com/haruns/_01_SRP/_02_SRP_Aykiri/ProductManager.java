package com.haruns._01_SRP._02_SRP_Aykiri;

public class ProductManager {
	public void manageProduct(String islemTuru, String productName) {
		if (islemTuru.equalsIgnoreCase("ekle")) {
			// urunEkle kodları
			System.out.println("Ürün Eklendi.");
		}
		else if (islemTuru.equalsIgnoreCase("sil")) {
			// urunSil kodları
			System.out.println("Ürün Silindi.");
		}
		else if (islemTuru.equalsIgnoreCase("goruntule")) {
			// urunGoruntule kodları
			System.out.println("Ürün Görüntülendi.");
		}
	}
	
	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
		pm.manageProduct("ekle","Telefon");
		pm.manageProduct("goruntule","Telefon");
		pm.manageProduct("sil","Telefon");
	}
}