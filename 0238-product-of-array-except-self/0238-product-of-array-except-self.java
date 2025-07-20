class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixsum[]=new int[nums.length+1];
         prefixsum[0]=1;
        int suffixsum[]=new int[nums.length+1];
         suffixsum[suffixsum.length-1]=1;
        for(int i=0;i<nums.length;i++)
        {
            prefixsum[i+1]=prefixsum[i]*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            suffixsum[i]=suffixsum[i+1]*nums[i];

        }
        int count=1;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i]=prefixsum[i]*suffixsum[count++];

        }
        return result;

        
    }
}