package playground.strings;
public class Strings {

	public static void main(String[] args) {
		String s1 = "Hi there";
		String a = new String("Hi there");
		String s2 = s1;
		String s3 = s2;
		String s4 = s1;
		s2.toLowerCase();
		
		if(s1.equals(a)) {
			System.out.println("yes");
		}
		
		Integer x = new Integer(5);
		Integer y = 5;
		int z = 5;
		
		
		if(x == y) {
			System.out.println("true1");
		}
		
		if(x.equals(y)) {
			System.out.println("true2");
		}
		
		Antiger(z);
		
		mystery(4321);
	}
	
	public static void Antiger(Integer a) {
		System.out.println(a.doubleValue());
	}
	
	public static void mystery (int x) {
	   System.out.print(x % 10);

	   if ((x / 10) != 0) {
	      mystery(x / 10);
	   }
	   System.out.print(x % 10);
	}
   
}
