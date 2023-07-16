package com.aurionpro.test;
import java.util.Scanner;

public class RideBillCalculator {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int bill = 0;
		    
		   System.out.println("Enter Height: ");
		   int height = sc.nextInt();
		   if(height<=120){
		    System.out.println("Cant ride");
		   } else{
		    System.out.println("can ride");
		    System.out.println("Enter Age: ");
		    int age = sc.nextInt();
		    if(age<12){
		        bill = bill + 5;
		    } else {
		        bill = bill + 7;
		    }
		     System.out.println("Want Photos?");
		    String wantPhotos = sc.next();
		    if(wantPhotos.equalsIgnoreCase("yes")){
		        bill = bill + 3;
		    }

		    System.out.println(bill);
		   
		   }

	}

}
