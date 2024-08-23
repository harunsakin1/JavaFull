package com.haruns;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class _09_SimpleDateFormat {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(date));
		
		String pattern = "dd-MM-yyyy";
		System.out.println(new SimpleDateFormat(pattern).format(date));
		
		Calendar calendar=Calendar.getInstance();
		System.out.println(sdf.format(calendar.getTime()));
		
		
		/*LocalDateTime localDate=LocalDateTime.now();
		System.out.println(sdf.format(localDate));*/
		
		
	}
	
}