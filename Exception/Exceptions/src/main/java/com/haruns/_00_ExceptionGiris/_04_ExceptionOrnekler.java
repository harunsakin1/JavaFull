package com.haruns._00_ExceptionGiris;

public class _04_ExceptionOrnekler {
	public static void main(String[] args) {
		String boy="170";
		// String --> int çevirme:
		int boyInteger = 0;
		try {
			boyInteger = Integer.parseInt(boy);
		}
		catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("Geçersiz format");
		}
		System.out.println(boyInteger);
	}
}