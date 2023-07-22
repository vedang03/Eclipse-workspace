package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class PolymorphismTest {

	public static void main(String[] args) {
		Man m1 = new Man();
		Boy b1 = new Boy();
		
		atParty(m1);
		atParty(b1);
		

	}
	
	public static void atParty(IMannerable m1) {
		m1.depart();
		m1.wish();
	}

	public void atMovie(IEmotionable e1) {
		e1.cry();
		e1.laugh();
	}
}
