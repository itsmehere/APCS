package lights;

public class Flashlight implements lightable{

	boolean hasBatteries;
	int batteryStrength;
	boolean lit;
	private final int MAX_BATTERY_STRENGTH = 100;
	
	public Flashlight() {
		this.hasBatteries = false;
		this.batteryStrength = 0;
		this.lit = false;
	}
	
	public Flashlight(boolean hasBatt) {
		this.batteryStrength = MAX_BATTERY_STRENGTH;
	}
	
	@Override
	public boolean isLit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLightStrength() {
		if(hasBatteries == false || batteryStrength < 50) {
			return 0;
		}
		return batteryStrength;
	}
	
	public void insertBattery() {
		this.hasBatteries = true;
		this.batteryStrength = MAX_BATTERY_STRENGTH;
	}
	
	public void removeBattery() {
		this.hasBatteries = false;
		this.batteryStrength = 0;
	}
	
	public void insertBattery(int strength) {
		this.hasBatteries = true;
		this.batteryStrength = strength;
	}
	
	public void turnOn() {
		this.lit = true;
	}

	public void turnOff() {
		this.lit = false;
	}
	
	public String toString() {
		return "Has Batteries?: " + hasBatteries + "\n" +
			   "Battery Strength: " + batteryStrength + "\n" +
			   "Lit?: " + lit + "\n";
	}
	
}
