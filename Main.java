import java.util.Scanner;// Import the Scanner class

public class Main
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in) ;
        System.out.println("Please enter your weight in pounds:");
        //Declare vars
        int weightPounds = keyboard.nextInt();
        double weightKg = (int) weightPounds / 2.20;
        //MET
        int runMet = 10;
        int basketMet = 8;
        int sleepMet = 1;
        //Calories for each activity
        double calRun = 0.0175 * runMet * (int) weightKg * 30;//30 is 30minutes
        double calBasket = 0.0175 * basketMet * (int) weightKg * 30;
        double calSleep = 0.0175 * sleepMet * (int) weightKg * 360;//360 is 360minutes
        int totalCal = (int)calRun + (int)calBasket + (int)calSleep; 
        //Print out the result for each activity
        System.out.println("If you run 30min with 6MPH, you spend " + calRun 
        + " calories.");
        System.out.println("If you play basketball for 30min, you spend " 
        + calBasket + " calories.");
        System.out.println("If you sleep for 6 hours, you spend " 
        + calSleep + " calories.");
        //Print total result
        System.out.println("Total calories spent with those activities is " 
        + totalCal + " calories.");
        
 
   }
}