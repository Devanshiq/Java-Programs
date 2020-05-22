package com.dla;
import java.util.Calendar;


/**
 * @authorDevLabs Alliance
 *
 */
public class NumberOfDays {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month= Calendar.MARCH;
		int date=1;
		cal.set(year, month, date);
		int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Number of Days :"+days);
		
	}

}
