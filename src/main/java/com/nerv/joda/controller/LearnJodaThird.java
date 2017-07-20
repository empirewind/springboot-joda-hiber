package com.nerv.joda.controller;

import java.time.DayOfWeek;

import org.joda.time.LocalDate;
import org.joda.time.MonthDay;

public class LearnJodaThird {

	/**
	 * 计算 11 月中第一个星期一之后的第一个星期二
	 */
	private void calDateOne(){
		LocalDate now = new LocalDate();
		LocalDate electionDate = now.monthOfYear()
				.setCopy(11)
				.dayOfMonth()
				.withMinimumValue()
				.plusDays(6)
				.dayOfWeek()
				.setCopy(DayOfWeek.MONDAY.getValue())
				.plusDays(1);
	}
	
	public static void main(String[] args) {
		LearnJodaThird learnJodaThird = new LearnJodaThird();
		learnJodaThird.calDateOne();
		
	}

}
