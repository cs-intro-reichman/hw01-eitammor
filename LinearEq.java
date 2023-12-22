// The program solves linear equations of the form a*x + b = c
public class LinearEq {
	public static void main(String[] args) {
		// Set three variables according to the given numbers.
		double a = Double.parseDouble ( args[0] );
		double b = Double.parseDouble ( args[1] );
		double c = Double.parseDouble ( args[2] );
		// Calculates x 
		double sol = (c-b)/a;
		// Prints the linear equations.
		System.out.println ( a + " * x + " + b + " = " + c);
		// Prints the solution of x.
		System.out.println ( " x = " + sol);
	}
}