package compInterface;

public class Wombat extends Animal{
	
	public Wombat() {
		super(1800, "Anonymous Wombat");
	}
	
	public Wombat(int wWeight, String wName) {
		super(wWeight, wName);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void eat(int amount) {
		System.out.println("Wombats dont gain weight when they eat!");
	}
}
