package com.haruns._27_Generics.Generic02;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("125");
		list.forEach(System.out::println);
		
		var ilkEleman = list.get(0);
		
	}
}