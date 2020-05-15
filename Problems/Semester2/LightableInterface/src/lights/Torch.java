package lights;

public class Torch implements lightable{

	String woodType;
	int flameStrength;
	boolean lit;

	public Torch(String wT) {
		if (wT == "Oak") {
			this.woodType = wT;
			this.flameStrength = 100;
		} else if (wT == "Chestnut") {
			this.woodType = wT;
			this.flameStrength = 200;
		} else if (wT == "Redwood") {
			this.woodType = wT;
			this.flameStrength = 300;
		}
	}
	
	@Override
	public boolean isLit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLightStrength() {
		if (lit == false || flameStrength <= 0) {
			return 0;
		}
		return flameStrength;
	}
	
	public void light() {
		lit = true;
	}
	
	public void extinguish() {
		lit = false;
	}
	
	void timeExpires() {
		flameStrength -= 1;
		if (flameStrength == 0) {
			lit = false;
		}
	}
	
	public String toString() {
		return "Woodtype: " + woodType + "\n" +
			   "FlameStrength: " + flameStrength + "\n" +
			   "Lit?: " + lit + "\n";
	}
	
}
