import java.util.ArrayList;

public class IntegerConversions {

	public static void main(String[] args) {
		
		/*
		 * Test cases for Hex.  Note the prefix “Ox” means that the number is a hexadecimal number
		 * 256 --> 0x100
		 * 921 --> 0x399
		 * 188 --> 0xBC
		 * 100 --> 0x64
		 * 590 --> 0x24E
		 * 11259375  --> 0xABCDEF
		 */

		System.out.println(toBinaryString(43));  //prints 101011
		System.out.println(toHexString(256)); //prints Ox100
		System.out.println(toHexString(921)); //prints Ox399
		System.out.println(toHexString(188)); //prints OxBC
		System.out.println(toHexString(100)); //prints Ox64
		System.out.println(toHexString(590)); //prints Ox24E
		System.out.println(toHexString(11259375)); //prints OxABCDEF
		
	}
	
	public static String toBinaryString(int n) {
		String binary = "";
		int dividingNum = n;
		
		if(n == 0) {
			return "0";
		}
		
		while(dividingNum != 0) {
			binary = Integer.toString(dividingNum % 2) + binary;
			dividingNum = dividingNum / 2;
		}
		
		return binary;
	}
	

	public static String toHexString(int n) {
		String hexString = "";
		char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		int dividingNum = n; 
		
		if(n == 0) {
			return "0x0";
		}
		
		while(dividingNum != 0) {
			hexString = (Character.toString(arr[dividingNum % 16])) + hexString;
			dividingNum = dividingNum / 16;
		}
		
		return "0x" + hexString;
		
	}

}
