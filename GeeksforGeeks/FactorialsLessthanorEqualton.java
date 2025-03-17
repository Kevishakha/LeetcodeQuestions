class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        
       return factorialnums(1,1,n,new ArrayList<>());
        
    }
    static ArrayList<Long>factorialnums(long i,long fact,long n,ArrayList<Long> result){
        if(fact>n){
            return result;
        }
        result.add(fact);
        return factorialnums(i+1,fact*(i+1),n,result);
    }
}
