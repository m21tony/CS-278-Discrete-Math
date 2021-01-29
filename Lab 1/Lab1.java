/*
 * CS 278 Discrete Math
 * Lab1.java
 * Written By: Antonio Maldonado
 * Date: August 23, 2018
 * Purpose: This program will generate and print out all possible truth tables
 * 			with three propositional variables p, q, and r.
 */

import java.util.*;

public class Lab1 {
	
	public static void main(String[] args) {
		
		int counter = 1;
		int a1, a2, a3, a4, a5, a6, a7, a8;
		
		for(a1 = 1; a1 <= 2; a1++) {
			for(a2 = 1; a2 <= 2; a2++) {
				for(a3 = 1; a3 <= 2; a3++) {
					for(a4 = 1; a4 <= 2; a4++) {
						for(a5 = 1; a5 <= 2; a5++) {
							for(a6 = 1; a6 <= 2; a6++) {
								for(a7 = 1; a7 <= 2; a7++) {
									for(a8 = 1; a8 <= 2; a8++) {
										
										System.out.println("Truth table " + counter + ":");
										System.out.println("p  q  r  proposition");
										System.out.println("----------------------");
										
										if(a1 == 1) {
											System.out.println("F  F  F  F");
										}
											else {
												System.out.println("F  F  F  T");
											}
										
										if(a2 == 1) {
											System.out.println("F  F  T  F");
										}
											else {
												System.out.println("F  F  T  T");
											}
										
										if(a3 == 1) {
											System.out.println("F  T  F  F");
										}
											else {
												System.out.println("F  T  F  T");
											}
										
										if(a4 == 1) {
											System.out.println("F  T  T  F");
										}
											else {
												System.out.println("F  T  T  T");
											}
										
										if(a5 == 1) {
											System.out.println("T  F  F  F");
										}
											else {
												System.out.println("T  F  F  T");
											}
										
										if(a6 == 1) {
											System.out.println("T  F  T  F");
										}
											else {
												System.out.println("T  F  T  T");
											}
										
										if(a7 == 1) {
											System.out.println("T  T  F  F");
										}
											else {
												System.out.println("T  T  F  T");
											}
										
										if(a8 == 1) {
											System.out.println("T  T  T  F");
										}
											else {
												System.out.println("T  T  T  T");
											}
										
										System.out.println();
										
										counter++;
												
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
