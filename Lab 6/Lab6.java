/*
 * CS 278 Discrete Math
 * Lab6.java
 * Written By: Antonio Maldonado
 * Date: October 09, 2018
 */


import java.util.Scanner;

public class Lab6{

   public static void main (String[] args) {
                
      Scanner sc = new Scanner(System.in);

      int count = 1;
      int onetoone=0;
      int onto = 0;
      int bijection = 0;
      
      System.out.println("The program will generate functions from X={a,b,c} to Y={0,1,...,n}.");
      
      //input from user

      System.out.print("Please enter the value of n: ");
      int n = sc.nextInt();

      //iterate nested loop through all the possible functions

      for(int i=0; i<=n ;i++){

         for(int j=0; j<=n ;j++){

            for(int k=0; k<=n ;k++){

      String s = "     " + "f" + count+" is";

      //one-to-one method

      if(i != j && j != k && i != k){

         onetoone++;

         s += " one-to-one,";

      }

      else{

         s += " not one-to-one,";

      }

      //onto method

      if(n==3){

         if(i != j && j != k && i != k){

            onto++;

            s += " onto,";

         }

      else {

          s += " not onto,";

      }

      } //end if


      else if (n==2){

         if(i != j || j != k || i != k){

            onto++;

            s += " onto,";

         }

      else{

         s += " not onto,";

      }

      }

      else if(n==1){
         
         if(i != j || j != k || i != k){

            onto++;

            s += " onto,";
         }
      else {
         
         s += " not onto,";
         
      }
      
      }
      
      // bijection method

      if(n<=3){

         if(i != j && j != k && i != k){

            bijection++;

           s += " and a bijection.";

         }

      else{

         s += " and not a bijection.";

      }

      }
     
      System.out.println("f"+ count + "(a)= "+ i + "   " + "f" + count + "(b)= " + j 
                         + "    " + "f" + count + "(c)= " + k);

      System.out.println(s);
      
      count++;

      } //end for k

         } //end loop j
         
            } //end loop i
     
      System.out.println("There are " + count + " functions total.");

      System.out.println(onetoone + "  of them are one-to-one.");

      System.out.println(onto + "  of them are onto.");

      System.out.println(bijection + "  of them are bijections.");
        

   } //end main

} //end Functions
