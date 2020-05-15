package inhertiance;

public class main {

	public static void main(String[] args) {
		Dog Lab = new Dog(5, "Canine", "Labrador Retriever");
		System.out.println(Lab.toString());
		Lab.animalGetsOlder(5);
		System.out.println(Lab.toString());
	}

}
