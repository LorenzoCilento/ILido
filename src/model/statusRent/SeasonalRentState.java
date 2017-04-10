package model.statusRent;

import model.BeachUmbrella;

public class SeasonalRentState implements StatusOfRent {

	private double price;
	private int percentageDiscount;
	private double fixedDiscount;
	
	
/*
 * BEGIN INTERFACE: STATUS_OF_RENT
*/
	@Override
	public void managementStateBeachUmbrella(BeachUmbrella beachUmbrella, StatusOfRent kindOfRent) {
			beachUmbrella.setStatusOfRent(kindOfRent);
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void percentageDiscountApplies(int percentage) {
		this.percentageDiscount=percentage;
	}

	@Override
	public void fixedDiscountApplies(double fixedDiscount) {
		this.fixedDiscount=fixedDiscount;
	}
	
	@Override
	public int getPercentageDiscountApplies() {
		return percentageDiscount;
	}

	@Override
	public double getFixedDiscountApplies() {
		return fixedDiscount;
	}	
/*
 * END INTERFACE: STATUS_OF_RENT  
*/
}
