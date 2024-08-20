package com.haruns._00_ExceptionGiris;

/**
 * Error
 * 1- CompileTime (Syntax hataları)
 * 2- RunTime : Program çalışırken oluşan hatalar.
 *      a- Exception (handle edilebilir hatalar)
 *          1-Checked
 *          2-UnChecked
 *      b- Error (handle edilemeyen hatalar) StackOverFlow
 * 3- Logical
 */
public class ExceptionGiris {
	public static void main(String[] args) {
		bolmeIslemi();
	/*	int payda = 0;
		int pay = 20;
		int sonuc = pay / payda; */
		/*
		Exception in thread "main": Main thread'de bir exception meydana geldi.
		 java.lang.ArithmeticException: Bu exception'ı fırlatan sınıfın adı.
		  / by zero : Exceptionla ilgili sınıftan gelen mesaj
	at com.barisd._00_ExceptionGiris.Main.main : hatanın gerçekleştiği metodun adı
	(Main.java:17) : hatanın meydana geldiği dosya ve satır numarası
		 */
		//System.out.println(sonuc);
		System.out.println("deneme");
	}
	//RunTime Exception türü dışında bir Exception throw edilirse checked exception fırlatmış oluruz.
	//Şuan ArithmeticException bir RunTime Exception türü olduğu için unchecked durumdadır. Try-catch ile sarmalamaya
	// zorlamaz.
	public static void bolmeIslemi() throws ArithmeticException{
		int payda = 0;
		int pay = 20;
		System.out.println("işlemden önceki kodlar");
		int sonuc = pay / payda; // bu hata bir unchecked exception'dır. Neden? Çünkü bu kodu yazarken beni hiç
		// uyarmadı. try/catche aldırmaya çalışmadı.
		System.out.println(sonuc);
	}
}