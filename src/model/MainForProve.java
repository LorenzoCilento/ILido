package model;

import model.statusRent.BimonthlyRentState;
import model.statusRent.HalfDayRentState;
import model.statusRent.MonthlyRentState;

public class MainForProve {

	public static void main(String[] args) {
		
		BeachUmbrella b = new BeachUmbrella(0, 3);
		System.out.println(b.getStatusOfRent().getClass());
		b.getStatusOfRent().managementStateBeachUmbrella(b, new HalfDayRentState());
		System.out.println(b.getStatusOfRent().getClass());
		
		Component c = new Cabin(new Duration(2));
		System.out.println(c.getClass());
		
		
	}
	
}
