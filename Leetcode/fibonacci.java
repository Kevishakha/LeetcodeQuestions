class Solution {
    public int fib(int n) {
        return fibn(n);
    }
    public int fibn(int n){
      if(n<=1){
        return n;
      }
        return fibn(n-1)+fibn(n-2);
    }
}
