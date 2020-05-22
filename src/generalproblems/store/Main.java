package generalproblems.store;

public class Main {

	public static void main(String[] args) {
		
		Good g = new Good("Can of dehydrated water", 1.50);
		System.out.println(g);
		
		Food f = new Food("Giant Gummy Bears", 15.0, 2000);
		System.out.println(f);
	}

}
