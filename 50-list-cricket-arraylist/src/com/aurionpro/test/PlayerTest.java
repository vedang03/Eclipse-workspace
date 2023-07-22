package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Player;
import com.aurionpro.model.ClassifyPlayers;

public class PlayerTest {
	public static void main(String[] args) {
		
	
	List<Player>players = new ArrayList<>();
	
	players.add(new Player(1,"Virat",500,12000,12));
	players.add(new Player(2,"Jadeja",350,7500,400));
	players.add(new Player(3,"Rohit",475,10000,30));
	players.add(new Player(4,"Raina",70,3000,78));
	players.add(new Player(5,"Chopra",10,20,1));
	
//	System.out.println(players);
	
   ClassifyPlayers obj = new ClassifyPlayers();
   System.out.println("Alisters: ");
   System.out.println(obj.getAlisters(players));
   System.out.println("Blisters: ");
   System.out.println(obj.getBlisters(players));
   System.out.println("Clisters: ");
   System.out.println(obj.getClisters(players));
	
	
	}
   
}
