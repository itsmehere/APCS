package compInterface;

public class Wildebeest extends Animal implements eatable{

	private int wildeWeight;
	private String wildeName;
	
	public Wildebeest(int bWeight, String bName) {
		super(bWeight, bName);
		this.wildeName = bName;
		this.wildeWeight = bWeight;
	}
	
	@Override
	public String toString() {
		return super.toString() + wildeWeight;
	}

	@Override
	public void eat(int amount) {
		this.wildeWeight += amount;	
	}
	
}
