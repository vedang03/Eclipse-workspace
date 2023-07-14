package com.aurionpro.test;

import com.aurionpro.model.Time;

public class TimeTest {
 public static void main(String[] args) {
	Time t1 = new Time(16,32,47);
	Time t2 = new Time(100,16,40);
	
	addTime(t1,t2);	
	
	System.out.println(t1);
	
	
	
		
	}
  public static Time addTime(Time t1 , Time t2) {
	  int secs = 0;
	  int mins = 0;
	  int hrs = 0;
	  if(t1.getSeconds() + t2.getSeconds() >60) {
		  mins+=1;
		  
		  secs = (t1.getSeconds() + t2.getSeconds()) - 60;
		  
	  } else {
		  secs = t1.getSeconds() + t2.getSeconds();
	  }
	  t1.setSeconds(secs);
	  if(t1.getMinutes() + t2.getMinutes() > 60) {
		  hrs+=1;
		  
		  	
	  } else {
		  mins = t1.getMinutes() + t2.getMinutes() + mins;
	  }
	  t1.setMinutes(mins);
	  
	  if(t1.getHours() + t2.getHours()>24) {
		 
		  t1.setHours((t1.getHours() + t2.getHours())%24);
	  }else {
	  hrs = t1.getHours() + t2.getHours();
	  t1.setHours(hrs);}
	  
	  return t1 ;
  }
}

