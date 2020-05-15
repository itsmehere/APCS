package compInterface;

public class Wombat extends Animal implements eatable{
	
	private int wombatWeight;
	private String wombatName;

	public Wombat() {
		super(1800, "Anonymous Wombat");
		this.wombatName = "Anonymous Wombat";
		this.wombatWeight = 1800;
	}
	
	public Wombat(int wWeight, String wName) {
		super(wWeight, wName);
		this.wombatName = wName;
		this.wombatWeight = wWeight;
	}
	
	@Override
	public String toString() {
		return super.toString() + wombatWeight;
	}

	@Override
	public void eat(int amount) {
		
	}
	
}
