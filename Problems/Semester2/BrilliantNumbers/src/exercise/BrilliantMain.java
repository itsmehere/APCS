package exercise;

import java.util.ArrayList;

public class BrilliantMain {
	
	private static ArrayList<Integer> factors = new ArrayList<Integer>();

	public static void main(String[] args) {
		if(isBrilliant(Integer.parseInt(args[0]))) {
			System.out.println(Integer.parseInt(args[0]) + " is a brilliant number.");
			System.out.println("It's factors are " + factors.get(0) + " and " + factors.get(1) + ".");
		}
	}

	public static void primeFactors(int num) {
		for (int i = 1; i <= num; i++) {
			if ((num % i == 0) && isPrime(i)) {
				factors.add(i);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		int numFactors = 0;
		
		for (int i = 1; i <= n; i++) {
			if ((n % i) == 0) {
				numFactors++;
			}
		}
		if (numFactors == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isBrilliant(int num){
		primeFactors(num);
		
		if(factors.size() == 2) {
			if(countDigits(factors.get(0)) == countDigits(factors.get(1))) {
				return true;
			}
		}
		return false;
	}
	
	public static int countDigits(int number) {
		int newNum = number;
		int numDigits = 0;
		
		while (newNum >= 1) {
			numDigits++;
			newNum = newNum / 10;
		}
		
		return numDigits;
	}
}
