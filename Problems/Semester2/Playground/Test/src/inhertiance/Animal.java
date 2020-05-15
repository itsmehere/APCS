package inhertiance;

public class Animal {
	private String species;
	private int age;
	
	public Animal(int age, String species) {
		this.age = age;
		this.species = species;
	}
	
	public void animalGetsOlder(int age) {
		this.age += age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSpecies() {
		return species;
	}
	
	@Override
	public String toString() {
		return("Species: " + species + "\n" + "Age: " + age);
	}
}
