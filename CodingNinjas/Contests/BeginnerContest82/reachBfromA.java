public class Solution {
    static int reachBFromA(int a, int b) {
        // Write your code here.
        int A=a;
        int B=b; 
        int diff=A-B;
        if(A==B) return 1;
        if(diff<=0) return 0;
         for(int X=2;X<=A;X++){
            if(A%X==0 && diff%X==0 ){
                return 1;
            }
        }
         
        

        return 0;
    }
}
