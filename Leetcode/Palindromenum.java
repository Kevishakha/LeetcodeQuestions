class Solution {
    public boolean isPalindrome(int x) {
        // get the digits by divide 10 or 100
        int temp=x;
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=(rev*10)+digit;
            x=x/10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
}
