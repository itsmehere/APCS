package playground.arraylists;
import java.util.*;

public class ListTesting2 {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(new Integer(1));
		System.out.println(list1);
		list1.add(new Integer(2));
		System.out.println(list1);
		list1.add(1, new Integer(3));
		System.out.println(list1);
		list1.add(1, new Integer(4));
		System.out.println(list1);
		System.out.println(list1.size());
	}

}
