package com.aurionpro.util;

public class InValidAgeException extends Exception {

	public InValidAgeException(String message) {
		super(message);
		this.message = message;
	}
	
	String message;
	
	public String getMessage() {
		return this.getClass().getSimpleName()+" "+message;
	}

	@Override
	public String toString() {
		return "InValidAgeException [message=" + message + "]";
	}


	
	
	
	
	
	

}
