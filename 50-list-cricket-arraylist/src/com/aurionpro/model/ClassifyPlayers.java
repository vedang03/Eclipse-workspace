package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ClassifyPlayers {

	public ArrayList<Player> getAlisters(List<Player> players) {
		ArrayList<Player> temp = new ArrayList<>();
		for (Player p : players) {
			if (p.getMatches() > 100 && (p.getRuns() > 5000 || p.getWickets() > 150)) {
				temp.add(p);
			}
		}
		return temp;
	}
	
	public ArrayList<Player> getBlisters(List<Player> players){
		ArrayList<Player>temp = new ArrayList<>();
		for(Player p : players) {
			if((p.getMatches()>50 && p.getMatches() <100 )&&((p.getRuns()>3000 && 
					p.getRuns()<5000) ||( p.getWickets()>75 && p.getWickets()<150))) {
				temp.add(p);
			}
		}
		return temp;
	}
	public ArrayList<Player> getClisters(List<Player>players){
		ArrayList<Player>temp = new ArrayList<>();
		for(Player p : players) {
			if(p.getMatches()<50 && (p.getRuns()<50 || p.getWickets()<75)) {
				temp.add(p);	
			}
		}
		return temp;
	}

}
