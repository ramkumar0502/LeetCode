class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefixsum[]=new int[nums.length+1];
        int suffixsum[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            prefixsum[i+1]=prefixsum[i]+nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            suffixsum[i]=suffixsum[i+1]+nums[i];
        }
      
        for(int i=1;i<prefixsum.length;i++)
        {
            if(prefixsum[i-1]==suffixsum[i])
            {
                return i-1;
            }
        }
        return -1;
        
    }
}