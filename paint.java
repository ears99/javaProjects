/*
A program that computes: 
   * the area of a wall
   * The paint needed in gallons
   * The amount of paint cans needed
   * The cost of the paint, including a 7% sales tax.
*/

import java.util.Scanner;

public class Paint {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallWidth;
      double wallHeight;
      double costPerCan; //cost of one can of paint
      double paintNeeded; //amount of paint needed; one can covers 350 sq ft
      double salesTax;
      double totalCost; //cost of the paint plus 7% sales tax

      //get user input for the wall area and paint cost
      wallWidth = scnr.nextDouble();
      wallHeight = scnr.nextDouble();
      costPerCan = scnr.nextDouble();
      
      //math stuff
      double wallArea = wallWidth * wallHeight;
      paintNeeded = wallArea / 350; //paint needed to cover the wall, in gallons
      double totalPaintNeeded = Math.ceil(paintNeeded) * costPerCan; //round the amount of gallons to the nearest can
      salesTax = totalPaintNeeded * 0.07;
      totalCost = totalPaintNeeded + salesTax;

      System.out.printf("Wall area: %.1f sq ft\n", wallArea);
      System.out.printf("Paint needed: %.3f gallons\n", paintNeeded);
      System.out.printf("Cans needed: %.0f can(s)\n", Math.ceil(paintNeeded));
      System.out.printf("Paint cost: $%.2f\n", totalPaintNeeded);
      System.out.printf("Sales tax: $%.2f\n", salesTax);
      System.out.printf("Total cost: $%.2f\n", totalCost);
   }
}
