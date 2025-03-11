import java.util.* ;
import java.io.*; 

public class Solution {
    public static int advancedGcd(int a, String b) {
        // Write your code here!
       // convert large number b to 'numB' b to b% a
        int numB=0;
        for(int i=0;i<b.length();i++){
            numB=(numB*10+(b.charAt(i)-'0'))%a;
        }

        int gcd=1;
         for(int i=1;i<=a;i++){
          if(a%i==0 && numB%i==0){
            gcd=i;
          }
         }
         return gcd;
    }
}
