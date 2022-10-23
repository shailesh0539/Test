package com.dfg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime1 {
	/**
	 * @param dateFormat
	 * @param days
	 * @return
	 * To get date by passing days
	 */
	public static String getDate(String dateFormat, int days) {
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		Date date = cal.getTime();
		return formatter.format(date);
	}
}
