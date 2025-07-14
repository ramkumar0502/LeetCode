class Solution {
    public int pivotIndex(int[] nums) {
      int prefixsum[]=new int[nums.length+1];
      int sufixsum[]=new int[nums.length+1];
      for(int i=0;i<nums.length;i++)
      {
        prefixsum[i+1]=prefixsum[i]+nums[i];
      }
      for(int i=nums.length-1;i>=0;i--)
      {
        sufixsum[i]=sufixsum[i+1]+nums[i];
      }
      int i=0;
     while(i<nums.length)
     {
      if(prefixsum[i+1]==sufixsum[i])
      {
        return i;
      }
      i++;
     }
     return -1;
        
        
    }
}