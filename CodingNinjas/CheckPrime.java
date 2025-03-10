import java.util.*;
public class Solution {

	public static ArrayList<Integer> primeNumbersTillN(int N) 
	{ 
	 	// Write your code here
		 ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int i=2; i<=N;i++){
			boolean isprime = true;
			for(int j=2;j*j<=i;j++){
			 if(i%j==0){
				  isprime = false;
				 break;
			 }
		 }
		  if(isprime){
				 primes.add(i);
			 }
		}

		


		 return primes;
	}
}
