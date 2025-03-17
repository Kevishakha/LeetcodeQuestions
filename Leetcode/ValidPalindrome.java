class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
          return isPalin(0,s);
    }
    boolean isPalin(int i, String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return isPalin(i+1,s);

    
    }
}
