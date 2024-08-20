package com.haruns._25_TextBlocks;

public class Runner {
	public static void main(String[] args) {
		String str= """
				selam
				benim\t\t adım
				harun\t\t sakın
				""";
		System.out.println(str);
		System.out.println("selam");
		System.out.println("benim\t\tadım");
		System.out.println("harun\t\tsakın");
		
		
		
		String str2= """
				harunsakin""";
		
		String str3="harunsakin";
		
		String str4="harun";
		String str5="harun";
		
		boolean esitMi=str2==str3?true:false;
		System.out.println(esitMi);
	}
	
}