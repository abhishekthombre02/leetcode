class Solution {
    public long dividePlayers(int[] skill) {
        
        Arrays.sort(skill);
        int n=skill.length,left=0,right=n-1,skillSum=skill[left]+skill[right];
        long chemistry=0;

        while(left<right){
            if(skill[left]+skill[right]!=skillSum){
                return -1;
            }
            chemistry+=skill[left]*skill[right];
            left++;
            right--;
        }

        return chemistry;
    }
}