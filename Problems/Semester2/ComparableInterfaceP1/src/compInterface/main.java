package compInterface;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		Cow[] cows = { new Cow(2000, "Hulk"),
				new Cow(),
				new Cow(1600, "Marty"),
				new Cow(1700, "Moohead"),
				new Cow(),
				new Cow(1900, "Mr. Fred") };
				printArray(cows);
				Arrays.sort(cows);
				printArray(cows);
	}

	public static void printArray(Cow[] cowList) {
		for (Cow cow : cowList) {
			System.out.print(cow.getName() + ", ");
		}
		System.out.println("\n");
	}
}
