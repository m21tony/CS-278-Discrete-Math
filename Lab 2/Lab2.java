/*
 * CS 278 Discrete Math
 * Lab2.java
 * Written By: Antonio Maldonado
 * Date: August 30, 2018
 * Purpose: This program implements the four fundamental logical functions (negation, disjunctive, conjunctive, 
 * 			and implicative) in four methods, then computes truth values for two compound statements.
 * 
 */

import java.util.*;

public class Lab2 {
	public static char conj( char p, char q) {
		
		if(p == 'T' && q == 'T')
			return 'T';
		else
			return 'F';
	}
	
	public static char disj(char p, char q) {
		
		if(p == 'F' && q == 'F')
			return 'F';
		else
			return 'T';
	}
	
	public static char neg(char p) {
		
		if(p == 'T')
			return 'F';
		else
			return 'T';
	}
	
	public static char impl(char p, char q) {
		
		if(p == 'T' && q == 'F')
			return 'F';
		else 
			return 'T';
	}
	
	//Main method 
	
	public static void main(String[] args) {
		
		char p, q, r;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter truth-value of p: ");
		p = scan.next().charAt(0);
		
		System.out.println("Please enter truth-value of q: ");
		q = scan.next().charAt(0);
		
		System.out.println("Please enter truth-value of r: ");
		r = scan.next().charAt(0);
		
		System.out.println("Truth value of statement 1 is: " + conj(impl(neg(p),q),impl(r,p)) + ".");
		System.out.println("Truth value of statement 2 is: " + conj(disj(p,neg(q)),disj(r,neg(impl(p,q)))) + ".");
		
	}

}
