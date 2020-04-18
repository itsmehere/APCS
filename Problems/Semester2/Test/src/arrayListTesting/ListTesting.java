package arrayListTesting;
import java.util.ArrayList;

public class ListTesting {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(6);
		intList.add(2);
		intList.add(9);
		intList.remove(new Integer(2));
		System.out.println(intList);
		
		// Integer wraps the primitive type, int, into a new object. Now,
		// the == operator checks if a and b are in the same memory location
		// which they are not. To check the value, we can use .equals()
		
		Integer a = new Integer(2);
		Integer b = new Integer(2);
		if(a == b) {
			System.out.println("yes1");
		}
		
		int c = 2;
		int d = 2;
		if(c == d) {
			System.out.println("yes2");
		}
		
		String e = new String("apple");
		stringEdit(e);
		System.out.println(e);
	}
	
	public static void stringEdit(String s) {
		s = s.toUpperCase();
		System.out.println(s);
	}

}
