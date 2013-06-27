package com.deathRay.util;

import java.util.Calendar;
import java.util.Date;

public class Util {

	public Util() {

	}

	public long dateToTimestampMicroseconds(Date date) {
		long epoch = 0L;
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			epoch = cal.getTimeInMillis() / 1000;
		} catch (Exception e) {
			System.out.println(e);
		}
		return epoch;
	}
}
