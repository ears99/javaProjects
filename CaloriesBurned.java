/*
A formula to output the average calories burned, with two decimal places of precision.

Calories = (Age * 0.2757 + weight * 0.03295 + heart rate * 1.0781 - 75.4991) * time / 8.368
*/

import java.util.Scanner;

public class CaloriesBurned {
   public static void main(String[] args) {
      int age; 
      double weightLBS;
      int heartBPM;
      double minutes;
      double caloriesBurned;

      Scanner sc = new Scanner(System.in);
      //get user input
      age = sc.nextInt();
      weightLBS = sc.nextDouble();
      heartBPM = sc.nextInt();
      minutes = sc.nextDouble();

      caloriesBurned = (age * 0.2757 + weightLBS * 0.03295 + heartBPM * 1.0781 - 75.4991) * minutes / 8.368;
      System.out.printf("Calories: %.2f", caloriesBurned);
      System.out.printf(" calories\n");

   }
}
