package com.haruns;

import java.util.Calendar;

public class _02_CalendarClass {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.getCalendarType()); // gregory
		System.out.println(calendar.getFirstDayOfWeek()); // 2
		System.out.println(calendar.getWeekYear()); // 2024
		System.out.println(calendar.getWeeksInWeekYear()); // 52
		System.out.println(calendar.getTime()); // Tue Aug 20 09:42:52 TRT 2024
	}
}