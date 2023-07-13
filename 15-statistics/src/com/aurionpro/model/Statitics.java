package com.aurionpro.model;

import java.util.Arrays;

public class Statitics {

	public static void main(String[] args) {
		int numbers[] = new int[args.length];
       for(int i=0;i<args.length;i++) {
    	   numbers[i] = Integer.parseInt(args[i]);
       }
       
       double sum = 0;
       for(int i=0;i<args.length;i++) {
    	   sum+=numbers[i];
       }
       System.out.println("Sum is: "+sum);
       
       int length = args.length;
       
       double average = sum / length;
       System.out.println("Average is: "+average);
       
       double minimum = Integer.MAX_VALUE;
       for (int i = 0; i < args.length; i++) {
		if(numbers[i]<minimum) {
			minimum = numbers[i];
		}
	}
       System.out.println("Minimum is: "+ minimum);
       
       double maximum = Integer.MIN_VALUE;
       for (int i = 0; i < args.length; i++) {
		if(numbers[i]>maximum) {
			maximum = numbers[i];
		}
	}
       System.out.println("Maximum is: "+ maximum);
       
       Arrays.sort(numbers);
       double median;
       
       if(length%2==1) {
    	   median = numbers[(length+1)/2-1];
       } else {
    	   median = (numbers[length/2-1]+numbers[length/2])/2;
       }
       System.out.println("Median is: "+median);
       
       	int [] frequency = new int[args.length];
       	
        int counted = -1;
        for(int i = 0; i < numbers.length; i++){
          int count = 1;
          for(int j = i+1; j < numbers.length; j++){
            if(numbers[i] == numbers[j]){
              count++;
              frequency[j] = counted;
            }
          }
          if(frequency[i] != counted)
            frequency[i] = count;
        }
        for (int i = 0; i < frequency.length; i++) {
			System.out.print(frequency[i] + " ");
		}
       
	}
	

}
