
class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
       List<Integer> result=new ArrayList<>();
       int[] freq=new int[arr.length];
       for(int num:arr){
           if(num>=1 && num<=arr.length){
             freq[num-1]++;  
           }
           
       }
       
       for(int i=0;i<arr.length;i++){
           arr[i]=freq[i];
       }
       for(int num:arr){
           result.add(num);
       }
       return result;
    }
}
