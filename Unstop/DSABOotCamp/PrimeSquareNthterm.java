import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
     static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
            
        }
        return true;
     }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        List<Integer> primes=new ArrayList<>();
        int num=2;
        while(primes.size()<N){
            if(isPrime(num)){
                primes.add(num);
            }
            num++;
        } 

        // 
        System.out.print(primes.get(N-1)*primes.get(N-1));
    }
}
