package playground.inheritance;

public class Dog extends Animal{
	
	private String breed;
	
	public Dog(int age, String species, String breed) {
		super(age, species);
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\n" + "Breed: " + breed);
	}
	
}
