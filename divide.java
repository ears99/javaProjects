/*
Program to divide a number multiple times. 
Ex: 2000 / 2 is divided to 1000, 500, and 250.

Enter whole numbers separated by spaces as input.
*/

import java.util.Scanner;

public class Divide {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int userNum = sc.nextInt();
      int divNum = sc.nextInt();
      int result; //result of the division. 

      result = userNum / divNum;
      System.out.print(result + " ");
      result = result / divNum;
      System.out.print(result + " ");
      result = result / divNum;
      System.out.println(result);

      //sanity check
      //System.out.println(userNum);
      //System.out.println(divNum);
   }
}
