package com.iitb.lokavidya.core.utils;

public class GeneralUtils {
	
	
	/*
	 * Generate Random Number of Digit Length
	 * @param int digitLength
	 * @return long_number_with_digit length
	 */
	public static Long generateRandomNumber(int digitLength) {
	    while (true) {
	        long numb = (long)(Math.random() * 100000000 * 1000000); // had to use this as int's are to small for a 13 digit number.
	        if (String.valueOf(numb).length() == digitLength)
	            return new Long(numb);
	    }
	}
}
