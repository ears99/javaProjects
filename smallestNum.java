/*
   A program that takes three integers and outputs the smallest of the three.
   Ex: if the input is 7 15 3, the output is 3.
*/

import java.util.Scanner;

public class smallestNum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //variables
      int int1, int2, int3, smallestInt;
      
      //user input
      int1 = sc.nextInt();
      int2 = sc.nextInt();
      int3 = sc.nextInt();
      
      /*
         if int1 < int2 && int1 < int3 : int1
         if int2 < int1 && int2 < int3 : int2
         if int3 < int2 && int3 < int1 : int3
      */

      //comparisons
      if(int1 < int2 && int1 < int3) {
            smallestInt = int1;
            System.out.println(int1);
      }  else if(int2 < int3 && int2 < int1) {
            smallestInt = int2;
            System.out.println(int2);
      } else if(int3 < int1 && int3 < int2) {
            smallestInt = int3;
            System.out.println(int3);
            } else {
               //all numbers are equal
               System.out.println(int1);
            }
         }
      }
