import java.util.*;
public class Sieve{
	public void primesTo (int n) throws IllegalArgumentException { 
		if (n < 2 ) { throw new IllegalArgumentException("Please enter an integer greater than or equal to 2");}
		ArrayQueue numbers = new ArrayQueue(); 
		for (int i =2 ; i <= n ; i ++) { 
			numbers.enqueue(i);
		}
		
		
		ArrayQueue primes = new ArrayQueue(); 
		int p = (int) numbers.first(); 
		ArrayQueue temp = new ArrayQueue(); 
		while (p<= Math.sqrt(n)) { 
			//ArrayQueue temp = new ArrayQueue(); 
			p = (int) numbers.dequeue(); 
			primes.enqueue(p);
			int numQueueSize = numbers.size(); 
			for (int i =0; i < numQueueSize ; i++) { 
				int t = (int)numbers.dequeue(); 
				if (t%p != 0) {
					temp.enqueue(t);
				}
			}
			int tempSize = temp.size(); 
			for (int j = 0 ; j < tempSize ; j++) {
				int primeNum = (int) temp.dequeue();
				numbers.enqueue(primeNum);
		}
		}
		int numSize = numbers.size(); 
				for (int i =0; i < numSize ; i++) { 
					int t = (int)numbers.dequeue(); 
					primes.enqueue(t);
		}
		int primeSize = primes.size() ; 
		for (int i =0; i< primeSize ; i++) 
			System.out.print(primes.dequeue() + " ");
		
		
	}
}
