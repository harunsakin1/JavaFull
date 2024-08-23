package com.haruns._01_SRP._02_SRP_Uygun;

public class ProductManager {
	public void addProduct(String productName){
		// urunEkle kodları
		System.out.println("Ürün Eklendi.");
	}
	public void viewProduct(String productName){
		// urunGoruntule kodları
		System.out.println("Ürün Görüntülendi.");
	}
	public void deleteProduct(String productName){
		// urunSil kodları
		System.out.println("Ürün Silindi.");
	}
	
	
	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
		pm.addProduct("Telefon");
		pm.viewProduct("goruntule");
		pm.deleteProduct("sil");
	}
}