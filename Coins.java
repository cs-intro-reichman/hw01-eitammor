//The program gets a number of cents as a commandline argument and prints 
//how to represent this quantity using as many quarters as possible plus
//the remainder in cents
public class Coins {
	public static void main(String[] args) {
		// Set one variable according to the amount of money.
		int a = Integer.parseInt ( args[0] );
		// Calculate the amount of quarters and cents 
		int quarters = a/25;
		int cents = a%25;
		// Prints the result
		System.out.println ( "Use " + quarters + " quarters and " + cents + " cents");
	}
}