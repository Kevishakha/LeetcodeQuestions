class Solution {
    public int reverse(int x) {
        
        int temp=x;
        int revnum=0;
        while(temp != 0){
            int ld=temp%10;
           
            if (revnum > Integer.MAX_VALUE / 10 || revnum < Integer.MIN_VALUE / 10){
                return 0;
            }
            revnum= (revnum*10) +ld;
            temp= temp/10;
        }
        return revnum;
    }
}
