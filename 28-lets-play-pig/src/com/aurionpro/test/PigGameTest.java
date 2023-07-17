package com.aurionpro.test;
import java.util.*;

import com.aurionpro.model.PigGame;

public class PigGameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		PigGame p1 = new PigGame();
		
		int turn = 1;
		p1.setAction("roll");
		int tuscore = 0;
		int toscore=0;
		
		while(p1.getTotalScore()<20) {
			tuscore=0;
			System.out.println("Turn: "+turn);
		do {
		
		System.out.println("Do you want to roll or hold?");
		p1.setAction(sc.next());
		
		if(p1.getAction().equalsIgnoreCase("roll")){
			p1.setDiceScore(rand.nextInt(6));
			if(p1.getDiceScore()==1) {
				System.out.println("Dice Score: "+p1.getDiceScore());
				System.out.println("Turn over");
				tuscore = 0;
				break;
			}else {
			tuscore+=p1.getDiceScore();
			System.out.println("Dice Score: "+p1.getDiceScore());
		
			}
				
		}else {
			break;
		}
		} while(p1.getAction().equalsIgnoreCase("roll") && p1.getTotalScore()<20);
		p1.setTurnScore(tuscore);
		System.out.println("Turn Score: "+p1.getTurnScore());
		toscore+=p1.getTurnScore();
		p1.setTotalScore(toscore);
		System.out.println("Total Score: "+p1.getTotalScore());
		turn++;

	}
		System.out.println("You win in: "+turn+ " turns");
	}

}
