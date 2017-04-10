package model.statusRent;

import model.BeachUmbrella;

public interface StatusOfRent {
	
//manage 
	public void managementStateBeachUmbrella(BeachUmbrella beachUmbrella, StatusOfRent kindOfRent);

//price
	public double getPrice();

//discount
	public void percentageDiscountApplies(final int percentage);

	public void fixedDiscountApplies(final double fixedDiscount);
	
	public int getPercentageDiscountApplies();

	public double getFixedDiscountApplies();

	
}
