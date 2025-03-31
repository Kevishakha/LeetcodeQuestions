class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n=prices.length;
        int minfor=prices[0];
        int res=0;
        for(int i=1;i<n;i++){
            minfor=Math.min(minfor ,prices[i]);
                res=Math.max(res , prices[i]-minfor);
            
        }
        return res;
    }
}
