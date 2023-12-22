// The program tests if three given integers
// form a triangle.
public class Triangle {
	public static void main(String[] args)	{
		// Set three variables according to the given integers.
		int a = Integer.parseInt ( args[0] );
		int b = Integer.parseInt ( args[1] );
		int c = Integer.parseInt ( args[2] );
		// Check if the three given integers can form 
		//a triangle.
		boolean check = (a+b>c) && (a+c>b) && (b+c>a);
		// Prints the result.
		System.out.println ( a + ", "+ b + ", " + c + ": " + check);
	}
}