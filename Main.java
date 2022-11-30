import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
		
		
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Please type the upper bound");
		int n = input.nextInt();
		Sieve sieve = new Sieve () ; 
		
		System.out.print( "Primes up to " + n + " are: "  );
		sieve.primesTo(n);
		System.out.println("\n");

		} catch (IllegalArgumentException e) { 
			System.out.println("Please enter an integer greater than or equal to 2" );
		}
	}

}
