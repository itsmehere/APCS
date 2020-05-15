package compInterface;

public class Horse extends Animal implements eatable{
	
	private int horseWeight;
	private String horseName;
	
	public Horse(int hWeight, String hName) {
		super(hWeight, hName);
		this.horseName = hName;
		this.horseWeight = hWeight;
	}
	
	@Override
	public String toString() {
		return super.toString() + horseWeight;
	}

	@Override
	public void eat(int amount) {
		this.horseWeight += amount;
	}	
}
