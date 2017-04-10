package model;

import java.sql.Date;

public class Duration {

	private Date beginDay;
	private int totalDays;
	private int hours;
	
	public Duration(int totalDays){
		this.totalDays=totalDays;
		hours=0;
		//beginDay
	}
	
	public Duration(int hours, boolean flag){
		if(flag)
			this.hours=hours;
	}
	
//calcolare se la data è scaduta
	
}
