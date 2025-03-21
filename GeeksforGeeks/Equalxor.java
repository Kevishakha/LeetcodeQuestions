class Solution {
    // Function to check if we can split the arr into segments satisfying the condition
    public boolean isEqualXor(int[] arr) {
        // Code Here
        int totalxor=0;
        for(int num:arr){
            totalxor ^=num;
        }
        if(totalxor==0){
            return true;
        }
        int count=0;
        int runxor=0;
        for(int num:arr){
            runxor ^=num;
            if(runxor==totalxor){
                count++;
                runxor=0;
            }
        }
        return count>1;
    }
}
