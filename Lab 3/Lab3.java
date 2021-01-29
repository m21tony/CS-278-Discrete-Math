/*
 * CS 278 Discrete Math
 * Lab3.java
 * Written By: Antonio Maldonado
 * Date: September 06, 2018
 * Purpose: This lab will find and print the smallest counterexample of odd number to disprove the following statement:
 * 			'Every odd number from 3 onwards can be written as the sum of a prime number and twice a square'
 * 
 */

public class Lab3 {
	
	public static boolean isPrime(int n) {
		
		if (n < 0) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int prime;
		int squares[] = new int[100];
		int flag = 0;
		int result = 0;

		
		for (int k = 0; k < 100; k++) {
			squares[k] = (int) (Math.pow(k, 2));
		}
		
		for (int i = 1001; i < 10000; i = i + 2) { 
			flag = 0;
			for (int j = 0; j < 100; j++) {
				prime = i - (2 * squares[j]);
				if (isPrime(prime) == true) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				result = i;
				break;
			}
		}	
		
		System.out.println("The smallest counter example is: " + result);
	}
}
