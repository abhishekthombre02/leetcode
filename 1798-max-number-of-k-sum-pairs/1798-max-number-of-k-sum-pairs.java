class Solution {
    public int maxOperations(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.getOrDefault(nums[i],0)>0 && map.getOrDefault(k-nums[i],0)>0){
                if(k-nums[i]==nums[i] && map.get(nums[i])<2){
                    continue;
                }
                count++;
                map.put(nums[i],map.get(nums[i])-1);
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }
        }

        return count;
    }
}