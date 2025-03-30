class Solution {
    public int maximumProfit(int prices[]) {
        // code here
       int n=prices.length;
       int lmx=prices[0];
       int lmn=prices[0];
       int res=0;
       int i=0;
       while(i<n-1){
           while(i<n-1 && prices[i]>=prices[i+1]){
               i++;
           }
           lmn=prices[i];
           while(i<n-1 && prices[i]<=prices[i+1]){
               i++;
           }
           lmx=prices[i];
           res +=(lmx-lmn);
       }
       return res;
        
    }
   
}
