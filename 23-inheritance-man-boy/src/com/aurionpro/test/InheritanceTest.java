package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest {

	public static void main(String[] args) {
		Man man = new Man();

//		man.play();
//		man.read();
//
//		Boy boy = new Boy();
//		boy.play();
//
//		boy.read();
//
//		Man man1 = new Boy();
//		man1.read();
		
		Object obj;
		 obj = 10;
		System.out.println(obj.getClass().getSimpleName());
		obj="HEllo";
		System.out.println(obj.getClass().getSimpleName());
		obj=16>15;
		System.out.println(obj.getClass().getSimpleName());
		
		Man man69 = new Infant();
//		if(man69 instanceof Infant) {
		 Infant aashish = (Infant) man69;
		 man69.play();
//		}
		 
		
		 
		
	}
	
}



