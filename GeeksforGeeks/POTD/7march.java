// Given a string s, return the length of the longest palindromic subsequence.

// A subsequence is a sequence that can be derived from the given sequence by deleting some or no elements without changing the order of the remaining elements.

// A palindromic sequence is a sequence that reads the same forward and backward.
class Solution {
    public int longestPalinSubseq(String s) {
        // code here
        int n = s.length();
        String revs = new StringBuilder(s).reverse().toString();
        
        int[][] dp=new int[n+1][n+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==revs.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                } else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
        
    }
}
