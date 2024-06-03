class Solution {
    public long dividePlayers(int[] skill) {
        
        Arrays.sort(skill);
        int n=skill.length,left=0,right=n-1;
        long a=skill[left],b=skill[right];
        long skillSum=a+b,chemistry=0;

        while(left<right){
             a=skill[left];
             b=skill[right];
            if(a+b!=skillSum){
                return -1;
            }
            chemistry+=a*b;
            left++;
            right--;
        }

        return chemistry;
    }
}