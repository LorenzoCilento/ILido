package model;

public class Cabin extends Component{

	private static double price=20;
	
	public Cabin(Duration duration) {
		super(duration);
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void setPrice(double p) {
		price=p;
	}
	
}
