// Problem Statement
// King Luther has an army with N soldiers, each with an ID between 1 and N. The king wants to know how many soldiers in his army are "brave."

// A soldier is considered "brave" if their ID has exactly two factors (or Divisors) and is not a perfect square.

// Since King Luther is busy with his duties, he needs your help to count the number of "brave" soldiers in his army.

// Your task is to count how many soldiers have "brave" IDs according to the criteria.



import java.util.Scanner;
import java.util.*;

public class Main {
    public static boolean[] sieve(int n){
         boolean[] isPrime = new boolean[n+1];
         Arrays.fill(isPrime,true);
         isPrime[0]=isPrime[1]=false;
         for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
         }
         return isPrime;
    }
    public static int countBraveSoldiers(int n) {
        boolean[] isPrime=sieve(n);
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                int sqrt=(int) Math.sqrt(i);
                if(sqrt*sqrt !=i){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countBraveSoldiers(n);
        System.out.println(result);
    }
}
