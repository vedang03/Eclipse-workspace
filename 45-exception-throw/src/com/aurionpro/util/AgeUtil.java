package com.aurionpro.util;

import javax.management.RuntimeErrorException;

public class AgeUtil {
	
	public static void validateAge(int age) throws InValidAgeException {
		if(age>=18) {
			System.out.println("Valid age");
		}else {
				throw new InValidAgeException("Invalid Age");
		}
	}

}
