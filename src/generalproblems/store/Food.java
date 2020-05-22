package generalproblems.store;

public class Food extends Good{

	private double calories;
	
	public Food(String description, double price, double calories) {
		super(description, price); //super must be the first line
		this.calories = calories;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString() + 
		"Calories: " + calories + "\n";
	}

	@Override
	public double calcTax() {
		return 0;
	}

}
