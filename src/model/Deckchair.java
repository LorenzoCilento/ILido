package model;

public class Deckchair extends Component{

	private static double price=10;
	
	public Deckchair(Duration duration) {
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
