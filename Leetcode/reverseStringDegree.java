class Solution {
    public int reverseDegree(String s) {
     int sum=0;
        for(int i=0;i<s.length();i++){
            int charVal=26-(s.charAt(i)-'a');
            sum+=charVal*(i+1);
            
        }
        return sum;
    }
}
