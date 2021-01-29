/*
 * CS 278 Discrete Math
 * Lab5.java
 * Written By: Antonio Maldonado
 * Date: October 01, 2018
 */

import java.util.*;

public class Lab5 {
	public static int universalSet[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    public static int setA[];
    public static int setB[];    
    public static void main (String args[]) {
    	
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the size of set A.");
        setA = new int[input.nextInt()];
        
        System.out.println("Please input the size of set B.");
        setB = new int[input.nextInt()];
        
        System.out.println("Please input the elements of set A.");
        
        for (int i = 0; i < setA.length; i++) {
            setA[i] = input.nextInt();
        }
        
        System.out.println("Please input the elements of set B.");
        for (int i = 0; i < setB.length; i++) {
            setB[i] = input.nextInt();
        }
        
        Arrays.sort(setA);
        Arrays.sort(setB);
        // Union
        System.out.println("The union of set A and set B is: " + union());
        // Intersection
        System.out.println("The intersection of set A and set B is: " + intersection());
        // Difference B-A
        System.out.println("The difference of set B - set A is: " + difference(setA, setB));
        // Complement A
        System.out.println("The complement of set A is: " + Arrays.toString(complement(setA)));
        // Cartesian Product setA x setB
        System.out.println("The cartesian product of setA and set B is: " + cartesianProduct(setA, setB));
        // Equivalence
        if (equals(setA, setB)) {
            System.out.println("Set A and Set B are equivalent.");
        }
        else {
            System.out.println("Set A and Set B are not equivalent.");
        }
        // Subset A of B
        if (subset(setA, setB)) {
            System.out.println("Set A is a subest of Set B.");
        }
        else {
            System.out.println("Set A is not a subset of Set B.");
        }
        // Partition
        if (partition()) {
            System.out.println("Set A and Set B are a partition of the universal set.");
        }
        else {
            System.out.println("Set A and Set B are not a partition of the universal set.");
        }
        input.close();
    }
    
    public static String union() {
    	
        int[] unionSet = new int[20];
        boolean isEqual = false;
        int index = setA.length;
        String union = "{ ";
        
        for (int i = 0; i < setA.length; i++) {
            unionSet[i] = setA[i];
        }
        
        for (int i = 0; i < setB.length; i++) {
            for (int j = 0; j < setA.length; j++) {
                if (setB[i] == setA[j]) {
                    isEqual = true;
                }
            }
            if (!isEqual) {
                unionSet[index] = setB[i];
                index++;
            }
            isEqual = false;
        }
        
        for (int i = 0; i < index; i++) {
            union += unionSet[i];
            if (i < index - 1) {
                union += ", ";
            }
        }
        union += " }";
        return union;
    }
    
    public static String intersection() {
    	
        String intersection = "{ ";
        int intersectionSet[] = new int[20];
        int index = 0;
        
        for (int i = 0; i < setA.length; i++) {
            for (int j = 0; j < setB.length; j++) {
                if (setA[i] == setB[j]) {
                    intersectionSet[index] = setA[i];
                    index++;
                }
            }
        }
        for (int i = 0; i < index; i++) {
            intersection += intersectionSet[i];
            if (i < index - 1) {
                intersection += ", ";
            }
        }
        intersection += " }";
        return intersection;
    }
    public static String difference(int a[], int b[]) {
    	
        String difference = "{ "; 
        int differenceSet[] = new int[20];
        int index = 0;
        boolean isEqual = false;
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    isEqual = true;
                    break;
                }
            }
            if (!isEqual) {
                differenceSet[index] = b[i];
                index ++;
            }
            isEqual = false;
        }
        
        for (int i = 0; i < index; i++) {
            difference += differenceSet[i];
            if (i < index - 1) {
                difference += ", ";
            }
        }
        
        difference += " }";
        return difference;
    }
    
    public static int[] complement(int a[]) {
    	
        int comp[] = new int[universalSet.length - a.length];
        int last = 0;
        boolean isIn = true;
        
        for (int i = 0; i < comp.length; i++) {
            for (int j = last; j < universalSet.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (a[k] == universalSet[j]) {
                        isIn = false;
                        break;
                    }
                }
                if (isIn) {
                    comp[i] = universalSet[j];
                    last = j + 1;
                    isIn = true;
                    break;
                }
                isIn = true;
            }
        }
        return comp;
    }
    
    public static String cartesianProduct(int a[], int b[]) {
    	
        String prod = "{ ";
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                prod += "(" + a[i] + "," + b[j] + ")";
                if (i != a.length - 1 || j != b.length - 1) {
                    prod += ", ";
                }
            }
        }
        prod += " }";
        return prod;
    }
    
    public static boolean equals(int a[], int b[]) {
    	
        if (a.length != b.length) {
            return false;
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean subset(int a[], int b[]) {
    	
        boolean check = false;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    check = true;
                }
            }
            if (!check) {
                return false;
            }
            check = false;
        }
        return true;
    }
    
    public static boolean partition() {
    	
        int[] testerSet = new int[20];
        
        if (setA.length + setB.length != 20) {
            return false;
        }
        for (int i = 0; i < setA.length; i++) {
            testerSet[i] = setA[i];
        }
        for (int i = 0; i < setB.length; i++) {
            testerSet[i + setA.length] = setB[i];
        }
        
        Arrays.sort(testerSet);
        return equals(testerSet, universalSet);
    }
}
