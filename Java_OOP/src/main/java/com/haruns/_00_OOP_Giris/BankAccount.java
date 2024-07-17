package com.haruns._00_OOP_Giris;

/**
 * Java 3 tip değişken vardır. 1. Object Variable ( Nesne Değişkeni, Instance Variable) 2. Class Variable (Sınıf
 * Değişkeni, Static Variable) 3. Local Variable (Yerel Değişken)
 */
public class BankAccount {
	//Sınıf Değişkeni (Static Variable)
	private static double faizOrani = 0.05;
	private static int hesapNoCounter;
	
	//Nesne Değişkenleri (Instance Variable,Field, Prop, Property)
	// Nesne değişkenlerinde ilk değer atamasanız bile derleyici onlara ilk değerleri verir.
	// boolean : false,
	// byte,short,int,long : 0
	// float, double : 0.0
	// char : '' , 0
	// String gibi referance tipler için: Null
	private int hesapNo;
	private String hesapSahibi;
	private double bakiye;
	
	//Constructor Metod: Nesne yaratmak için kullanılır.
	
	//Default Constructor: Parametre almayan constructor.
	public BankAccount() {
		hesapNoCounter++;
		this.hesapNo = hesapNoCounter;
	}
	
	//Parametreli Constructor
	public BankAccount(String hesapSahibi, double bakiye) {
		hesapNoCounter++;
		this.hesapNo = hesapNoCounter;
		this.hesapSahibi = hesapSahibi;
		this.bakiye = bakiye;
		
	}
	
	public static double getFaizOrani() {
		return faizOrani;
	}
	
	public static void setFaizOrani(double faizOrani) {
		BankAccount.faizOrani = faizOrani;
	}
	
	public static void faizEkle(BankAccount hesap) {
		double faizGeliri = hesap.getBakiye() * faizOrani;
		hesap.setBakiye(hesap.getBakiye() + faizGeliri);
		System.out.println(faizGeliri + " TL faiz geliri eklendi. Yeni Bakiye:" + hesap.getBakiye());
	}
	
	public double getBakiye() {
		return bakiye;
	}
	
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	public int getHesapNo() {
		return hesapNo;
	}
	
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}
	
	public String getHesapSahibi() {
		return hesapSahibi;
	}
	
	public void setHesapSahibi(String hesapSahibi) {
		this.hesapSahibi = hesapSahibi;
	}
	
	// Metodlarınız:
	public void paraYatir(double miktar) {
		bakiye += miktar;
		System.out.println(miktar + " TL hesaba yatırıldı. Bakiye:" + bakiye);
	}
	
	public void paraCek(double miktar) {
		bakiye -= miktar;
		System.out.println(miktar + " TL hesaptan çekildi. Bakiye:" + bakiye);
	}
	
	public void faizEkle() {
		double faizGeliri = bakiye * faizOrani;
		bakiye += faizGeliri;
		System.out.println(faizGeliri + " TL faiz geliri eklendi. Yeni Bakiye:" + bakiye);
	}
	
	@Override
	public String toString() {
		return "BankAccount{" + "bakiye=" + bakiye + ", hesapNo=" + hesapNo + ", hesapSahibi='" + hesapSahibi + '\'' + '}';
	}
}