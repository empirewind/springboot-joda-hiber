package com.nerv.joda.controller;

import java.awt.SystemColor;
import java.awt.datatransfer.SystemFlavorMap;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class LearnJodaTwo {

	/**
	 * LocalDate类
	 */
	private void localDatefun(){
		LocalDate localDate =  new LocalDate(2009, 9, 6);
		System.out.println(localDate.toString());
	}
	/**
	 * LocalTime类
	 */
	private void localTimefun(){
		LocalTime localTime = new LocalTime(13, 30, 26, 0);
		System.out.println(localTime.toString());
	}
	
	public static void main(String[] args) {
		LearnJodaTwo learnJodaTwo = new LearnJodaTwo();
		learnJodaTwo.localDatefun();
		learnJodaTwo.localTimefun();
		
	}

}
