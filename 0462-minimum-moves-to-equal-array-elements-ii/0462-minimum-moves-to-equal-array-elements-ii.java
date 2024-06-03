class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i=0,ans=0;
        int mid=(nums.length-1)/2;

        while(i<nums.length){
            ans+=Math.abs(nums[mid]-nums[i]);
            i++;
        }
        return ans;
    }
}