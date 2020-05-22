package generalproblems.store;

public class Good implements Taxable{

	//instance variables
	private String description;
	private double price;
	
	public Good(String description, double price) {
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override 
	public String toString() {
		return "item: " + description + "\n" + 
			   "price: $" + price + "\n" +
			   "Tax: " + this.calcTax() + "\n";
	}
	
	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		return this.price * CA_TAX_RATE;
	}

}
