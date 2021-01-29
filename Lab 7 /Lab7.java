/*
 * CS 278 Discrete Math
 * Lab7.java
 * Written By: Antonio Maldonado
 * Date: October 30, 2018
 */

import java.util.Scanner;
import java.lang.Math;

public class Lab7 {

	static int sum1(int n){ //sum of 2^n
		// base case:
		if (n==0)
			return 1;
		// recursive (inductive) step:
		int inductive_hp = sum1(n-1); //inductive hypothesis corresponds to a recursive call to compute
		// the summation up to n-1,
		int last_term = (int) Math.pow(2, n); //last term separated from the summation
		return (inductive_hp + last_term);
	}

	static int sum2(int n) { //sum of n(n+1)
		// base case:
		if (n==1)
			return 2;
		// recursive (inductive) step:
		int inductive_hp = sum2(n-1); //inductive hypothesis corresponds to a recursive call to compute
		// the summation up to n-1,
		int last_term = (int) n*(n+1); //last term separated from the summation
		return (inductive_hp + last_term);
	}

	public static void main(String args[]){

		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the value of n: "); //user input
		n = input.nextInt();

		System.out.println("The value of the first summation is: " + sum1(n)); //result of the summations 
		System.out.println("The value of the second summation is: " + sum2(n));

	}
}
