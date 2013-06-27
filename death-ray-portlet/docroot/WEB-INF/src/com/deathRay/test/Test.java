package com.deathRay.test;

import com.deathRay.util.Util;

import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util u = new Util();		
		System.out.println(u.dateToTimestampMicroseconds(new Date()));

	}

}
