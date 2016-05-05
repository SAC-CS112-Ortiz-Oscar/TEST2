// Oscar Ortiz
// Test 2
// 5/4/2016

import java.util.Scanner;

public class Test
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		// Construct three automobiles
		Automobile truck = new Automobile("F150", 3);
		Automobile van = new Automobile("Transit-350", 3);
		Automobile sportsCar = new Automobile("Mustang", 3);
		
		// Get number of dices
		System.out.print("Enter number of dices: ");
		int diceNumber = input.nextInt();
		
		// Roll dice
		Dice newRoll = new Dice();
		int diceRoll = newRoll.throwDice(diceNumber);
		
		//Operate truck
		int truckDistance = 0;
		for( int gear = 0; gear < diceRoll; gear++)
		{
			truckDistance =+ (truck.getCurrentSpeed(gear) / 60);
		}
		
		// Operate van
		int vanDistance = 0;
		for( int gear = 0; gear < diceRoll; gear++)
		{
			vanDistance =+ (van.getCurrentSpeed(gear) / 60);
		}
		
		// Operate sports car
		int sportsCarDistance = 0;
		for( int gear = 0; gear < diceRoll; gear++)
		{
			sportsCarDistance =+ (sportsCar.getCurrentSpeed(gear) / 60);
		}
		
		System.out.println("The distance traveled by the truck is " + truckDistance + " miles.");
		
	}
}
