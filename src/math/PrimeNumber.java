package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int counter = 0;
		for(int i=2; i<=1000000000; i++) {
			if (isPrime(i)) {
				counter++;
				System.out.println(i);
			}
		}
		System.out.println("Total prime number:" + "\t" +  counter);
	}



	public static boolean isPrime(int s){//using Boolean if the statement is true or false.
		if(s % 2==0 ) return false;

		for(int i=3; i*i<=s; i+=2){
			if(s % i ==0)
				return false;

		}
		return true;
	}
	}
