class Solution {
    public void sortColors(int[] nums) {
        
       int[] count= new int[3];
       int len=nums.length;

       for(int i: nums)
       {
           if(i==0)
           count[0]++;
           else if(i==1)
           count[1]++;
           else
           count[2]++;

       }

       for(int i=0;i<count[0];i++)
       { 
            nums[i]=0;
           
       }
       for(int i=count[0];i<count[0]+count[1];i++){
           nums[i]=1;
       }
       for(int i=count[0]+count[1];i<len;i++){

           nums[i]=2;
       }
    }
}