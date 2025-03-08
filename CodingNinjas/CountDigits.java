import java.util.* ;
import java.io.*; 

public class Solution {
    static int countDigit(long x) {
        // Write your code here.
        int count=0;
        while(x > 0){
          count =count+1;
          x= x/10;
        }
        return count;
    }
}


// second approach


import java.util.* ;
import java.io.*; 

public class Solution {
    static int countDigit(long x) {
        // Write your code here.
        int count = (int)(Math.log10(x)+1);
        return count;
    }
}
