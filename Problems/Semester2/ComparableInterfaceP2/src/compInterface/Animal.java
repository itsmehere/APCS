package compInterface;

public class Animal implements Comparable<Animal>{
	
	private int animalWeight;
	private String animalName;
	
	public Animal(int aWeight, String aName) {
		this.animalName = aName;
		this.animalWeight = aWeight;
	}
	
	@Override
	public String toString() {
		return animalName + ": " + this.animalWeight;
	}

	@Override
	public int compareTo(Animal a) {
		if(this.animalWeight == a.animalWeight) {
			return 0;
		} else if (this.animalWeight >= a.animalWeight) {
			return 1;
		}
		return -1;
	}
	
	public void eat(int amount) {
		this.animalWeight += amount;
	}	
}
