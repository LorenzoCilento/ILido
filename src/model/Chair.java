package model;

public class Chair extends Component {

	private static double price=10;
	
	public Chair(Duration duration) {
		super(duration);
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
}
