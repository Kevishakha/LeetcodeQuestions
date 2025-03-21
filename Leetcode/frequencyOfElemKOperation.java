class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxfreq=1;
        for(int i=0;i<n;i++){
            
            int currentfreq=1;
            int target=nums[i];
            int remainingk=k;
            for(int j=i-1;j>=0;j--){
                int diff=target-nums[j];
                if(remainingk>=diff){
                    remainingk -=diff;
                    currentfreq++;
                }else{
                    break;
                }
              
            }
            maxfreq=Math.max(maxfreq,currentfreq);
        }
        return maxfreq;
    }
}
