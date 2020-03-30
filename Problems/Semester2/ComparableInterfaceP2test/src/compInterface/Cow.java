package compInterface;

public class Cow extends Animal implements eatable{

	private int cowWeight;
	private String cowName;

	public Cow(int cWeight, String cName) {
		super(cWeight, cName);
		this.cowName = cName;
		this.cowWeight = cWeight;
	}
	
	@Override
	public String toString() {
		return super.toString() + cowWeight;
	}

	@Override
	public void eat(int amount) {
		this.cowWeight += amount;
	}
	
}
