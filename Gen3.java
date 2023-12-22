// The program generates three random integers, each in a given range [a,b),
// i.e. greater than or equal to a and less than b, prints them, and then prints the minimal number
//that was generated.
public class Gen3 {
	public static void main(String[] args) {
		// Set two variables according to the 
		//given integers to set the range.
		int a = Integer.parseInt ( args[0] );
		int b = Integer.parseInt ( args[1] );
		//Generates three numbers in the given range.
		int gen1 = (int)(((b-a)*Math.random())+a);
		int gen2 = (int)(((b-a)*Math.random())+a);
		int gen3 = (int)(((b-a)*Math.random())+a);
		// Prints the three generated numbers.
		System.out.println (gen1);
	 	System.out.println (gen2);
		System.out.println (gen3);
		// Check which one is the minimal generated number.
		int min = Math.min(gen1, gen2);
		if(gen3<min){
			min = gen3;
		}
		// Prints the minimal generated number.
		System.out.println ("The minimal generated number was " + min);

	}
}