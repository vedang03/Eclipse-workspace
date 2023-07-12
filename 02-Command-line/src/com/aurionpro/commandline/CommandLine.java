package com.aurionpro.commandline;import javax.security.auth.callback.ConfirmationCallback;

public class CommandLine {

	public static void main(String[] args) {
		int numbers[] = new int[args.length];
		for(int i=0;i<args.length;i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}
		
		int max = 0;
		int secondMax = Integer.MIN_VALUE;
	
		for(int i=0;i<args.length;i++) {
		  if(numbers[i]>max ) {
			  secondMax = max;
			  max = numbers[i];
		  }
		  if(numbers[i] >secondMax && numbers[i] < max) {
			  secondMax = numbers[i];
		  }
		
		}
		System.out.println("SecondMax is: "+secondMax);
		
		
	
		
	}

}
