package com.aurionpro.model;

public class ClassifyPlayers extends Player {
	
	

	public ClassifyPlayers(int id, String name, int matches, int runs, int wickets) {
		super(id, name, matches, runs, wickets);
		// TODO Auto-generated constructor stub
	}

	public static Player[] getAlisters(Player[] players){
		int count =0;
		for (int i = 0; i < players.length; i++) {
			if(players[i].getMatches()>100 && (players[i].getRuns()>5000 || players[i].getWickets() >150 )) {
				System.out.println(players[i]);
				count++;
			}
			
		}
		Player[] alist = new Player[count];
		for (int i = 0,j=0; i < players.length; i++) {
			if(players[i].getMatches()>100 && (players[i].getRuns()>5000 || players[i].getWickets() >150 )) {
				alist[j++]=players[i];
		}
	
		}
		return alist;
		
	}
	
	public static Player[] getBlisters(Player[] players) {
		int count=0;
		for (int i = 0; i < players.length; i++) {
			if((players[i].getMatches()>50 && players[i].getMatches() <100 )&&((players[i].getRuns()>3000 && 
					players[i].getRuns()<5000) ||( players[i].getWickets()>75 && players[i].getWickets()<150))) {
				count++;
			}
			
		}
		Player[] blist = new Player[count];
		for (int i = 0,j=0; i < players.length; i++) {
			if((players[i].getMatches()>50 && players[i].getMatches() <100 )&&((players[i].getRuns()>3000 && 
					players[i].getRuns()<5000) ||( players[i].getWickets()>75 && players[i].getWickets()<150))) {
				blist[j++]=players[i];
			}
		}
		return blist;
	}
	
	public static Player[] getClisters(Player[] players) {
		int count =0;
		for (int i = 0; i < players.length; i++) {
			if(players[i].getMatches()<50 && (players[i].getRuns()<50 || players[i].getWickets()<75)) {
				count++;
			}
		}
		Player[] clist = new Player[count];
		for (int i = 0,j=0; i < players.length; i++) {
			if(players[i].getMatches()<50 && (players[i].getRuns()<50 || players[i].getWickets()<75)) {
			   clist[j++]=players[j];
			}
		}
		return clist;
		
		
	}

	


}
