package com.nerv.joda.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class LearnJodaOne {

	/**
	 *  jdk自带的时间calendar
	 */
	private void timeCalendar(){
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
		SimpleDateFormat sdf = new SimpleDateFormat("E MM/dd/yyyy HH:mm:ss.SSS");
		calendar.add(Calendar.DAY_OF_MONTH, 90);
		System.out.println(sdf.format(calendar.getTime()));
	}
	
	/**
	 * joda时间
	 */
	private void timeJoda(){
		DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		System.out.println(dateTime.plusDays(45).plusMonths(1).dayOfWeek()
		.withMaximumValue().toString("E MM/dd/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	 * calendar与joda互相操作
	 */
	private void calendarAndJoda(){
		Calendar calendar = Calendar.getInstance();
		DateTime dataTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		System.out.println(dataTime.plusDays(45).plusMonths(1).dayOfWeek()
				.withMaximumValue().toString("E MM/dd/yyyy HH:mm:ss.SSS"));
		calendar.setTime(dataTime.toDate());
	}
	/**
	 * Joda与Calendar互相操作
	 */
	private void JodaAndCalendar(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		DateTime dataTime = new DateTime(calendar);
		String dataString = dataTime.toString("E MM/dd/yyyy HH:mm:ss.SSS");
		System.out.println(dataString);
	}
	
	
	public static void main(String[] args) {
		LearnJodaOne learnJodaOne = new LearnJodaOne();
		learnJodaOne.timeCalendar();
		learnJodaOne.timeJoda();
		learnJodaOne.JodaAndCalendar();
	}
}
