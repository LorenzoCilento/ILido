package model;

import java.util.ArrayList;

import model.statusRent.FreeRentState;
import model.statusRent.StatusOfRent;

public class BeachUmbrella {
	
//position
	private Arrangement arrangement;
//state of rent
	private StatusOfRent statusOfRent;
//chair
	private ArrayList<Chair> chairs;
//deckchair
	private ArrayList<Deckchair> deckchairs;
	
	
	
	public BeachUmbrella() {
		this.arrangement=new Arrangement(0,0);
		this.statusOfRent = new FreeRentState();
		this.chairs = new ArrayList<Chair>();
		this.deckchairs = new ArrayList<Deckchair>();
	}
	
	public BeachUmbrella(int number,int line) {
		this.arrangement=new Arrangement(number,line);
		this.statusOfRent = new FreeRentState();
		this.chairs = new ArrayList<Chair>();
		this.deckchairs = new ArrayList<Deckchair>();
	}
	
	
	public StatusOfRent getStatusOfRent() {
		return statusOfRent;
	}

	public void setStatusOfRent(StatusOfRent statusOfRent) {
		this.statusOfRent = statusOfRent;
	}

	public ArrayList<Chair> getChairs() {
		return chairs;
	}

	public void setChairs(ArrayList<Chair> chairs) {
		this.chairs = chairs;
	}

	public ArrayList<Deckchair> getDeckchairs() {
		return deckchairs;
	}

	public void setDeckchairs(ArrayList<Deckchair> deckchairs) {
		this.deckchairs = deckchairs;
	}

	public Arrangement getArrangement() {
		return arrangement;
	}

	public void setArrangement(Arrangement arrangement) {
		this.arrangement = arrangement;
	}
	

}
