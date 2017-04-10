package model;

public abstract class Component extends AbstractObject{

	
	private Duration duration;
	private boolean isFree;
	private boolean active;
	
	public abstract double getPrice();
	public abstract void setPrice(double p);
	
	
	public Component(Duration duration){
		super();
		this.duration=duration;
		this.isFree=false;
		this.active=false;		
	}
	
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	
}
