// User function Template for Java
class Solution {
    public static int sumOfDivisors(int n) {
        // code here
        int sum=0;
        for(int i=1; i<=n;i++){
            int sumdiv=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sumdiv +=j;
                }
            }
            sum+=sumdiv;
        }
        return sum;
    }
}
