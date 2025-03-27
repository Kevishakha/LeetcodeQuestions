class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(isSort(nums)){
                return true;
            }
            rotate(nums);
        }
        return false;
    }
    private boolean isSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
           
        }
         return true;
    }
    private void rotate(int[] nums){
        int n=nums.length;
        int first=nums[0];
        for(int i=0;i<n-1;i++){
          nums[i]=nums[i+1];
        }
        nums[n-1]=first;
    }
}
