package com.haruns._01_UserDefinedException;

public class Notlar {
	public static void main(String[] args) {
		try {
			notKontrol(120);
		}
		catch (NotOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program çalışmaya devam ediyor...");
	}
	
	private static void notKontrol(int not) throws NotOutOfBoundsException {
		if (not < 0 || not > 100) {
			// kendimiz hata fırlatabiliriz.
			throw new NotOutOfBoundsException("Not 0-100 arasında değil");
		}
		else {
			System.out.println("Not sorunsuz.");
		}
	}
	
}