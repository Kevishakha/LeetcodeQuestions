class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
            for(Map.Entry<Integer,Integer> it:map.entrySet()){
                int ele=it.getKey();
                int cnt=it.getValue();
                if(cnt>n/3){
                    res.add(ele);
                }
            }
        
        if(res.size()==2 && res.get(0)>res.get(1)){
            Collections.swap(res,0,1);
        }
        return res;
    }
}
