package generalproblems.compinterface.parttwo;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		Animal[] animals = { new Horse(2000, "Hulk"),
				new Wombat(),
				new Wombat(1600, "Marty"),
				new Cow(1700, "Moohead"),
				new Wombat(),
				new Wildebeest(1900, "Mr. Fred") };
				
				printArray(animals);
				
				for (Animal a : animals) {
					a.eat(200);
				}
				
				Arrays.sort(animals);
				System.out.println();
				printArray(animals);
				
	}
	
	public static void printArray(Animal[] animals) {
		for (Animal a : animals) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}
}
