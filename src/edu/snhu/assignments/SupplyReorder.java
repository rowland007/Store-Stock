package edu.snhu.assignments;

/******************************************************************************
 Program:		Store Stock
 Author:		   Randall Rowland
 Class:			IT 145 Foundations in App Development
 Instructor:	Jim Barringer
 Date:			18 Jan 2019
 Description:  The Store Stock program requests the current on hand stock of
               apples and oranges.  It also requests what the stock should be.
               It will then output how many apples and oranges need to be
               ordered to ensure a proper stock is maintained.
 Input:        stdin
 Output:       stdout

 Known bugs/missing features:
               Doesn't validate the user's input.  If they use anything besides
               an integer, it will cause the program to crash.

 License:      GNU General Public License v3.0
 Modifications:
 Date                Comment
 ----    ------------------------------------------------
 ******************************************************************************/
import java.util.Scanner;

public class SupplyReorder {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("How many apples do you have on hand?");
      applesOnHand = scan.nextInt();

      System.out.println("How many apples do you want to keep in stock?");
      applesRequirement = scan.nextInt();

      System.out.println("How many oranges do you have on hand?");
      orangesOnHand = scan.nextInt();

      System.out.println("How many oranges do you want to keep in stock?");
      orangesRequirement = scan.nextInt();

      applesNeeded = stockToOrder(applesOnHand, applesRequirement);
      orangesNeeded = stockToOrder(orangesOnHand, orangesRequirement);

      System.out.println("You need to order " + applesNeeded + " apples and " + orangesNeeded + " oranges.");
   }

   // declare and init apple variables
   static private int applesOnHand        = 0;
   static private int applesRequirement   = 0;
   static private int applesNeeded        = 0;

   // declare and init orange variables
   static private int orangesOnHand       = 0;
   static private int orangesRequirement  = 0;
   static private int orangesNeeded       = 0;

   // Used to check the math and if it comes out to less than zero it will set it to zero.  You can't order
   // negative fruit and you can't give back fruit. Used a function so I didn't have to write the code twice
   // for each fruit.  Could also be used later with other fruit.
   static private int stockToOrder(int onHand, int Requirement) {
      if( (Requirement - onHand) < 0 ) {
         return 0;
      }
      else {
         return (Requirement - onHand);
      }
   }
}