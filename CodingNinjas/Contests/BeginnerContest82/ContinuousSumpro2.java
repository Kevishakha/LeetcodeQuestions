public class Solution {
    static int isThereValidArray(int n, int s) {
        // Write your code here.
        int S=s;
        for(int A0=1;A0<=S;A0++){
           int sum=0;
           for(int i=0;i<n;i++){
               sum+=(A0+i);
           }
           if(sum==S){
            return 1;
        }
        }

       return 0; 
    }
}
