
import java.util.Scanner;
import java.util.Random;

public class Dice {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int i = 0;          // Loop counter iterates numRolls times
      int[] totalS = new int[13];
      int die1 = 0;       // Dice values
      int die2 = 0;       // Dice values
      int sum = 0;  // Sum of dice values

      System.out.println("Enter number of rolls: ");
      int numRolls = scnr.nextInt();
      
      for(i = 0; i < numRolls; i++){
    	  die1 = randGen.nextInt(6) + 1;
          die2 = randGen.nextInt(6) + 1;
          sum = die1 + die2;
          System.out.println("Roll " + (i+1) + " is " + 
                  sum + " (" + die1 + 
                  "+" + die2 + ")");
          System.out.println(sum);
          totalS[sum] = totalS[sum] + 1;
      }
      System.out.println();
      
      for(i = 2; i < totalS.length; i++){
    	  System.out.print(i + "'s: ");
    	  System.out.println(totalS[i]);
      }
      System.out.println();
      
      for(i = 2; i < totalS.length; i++){
    	  System.out.print(i + "'s: ");
          for (int x = 0; x < totalS[i]; x++) {
            System.out.print("*");
            }
         System.out.println();
      }
      
      return;
   }
}
