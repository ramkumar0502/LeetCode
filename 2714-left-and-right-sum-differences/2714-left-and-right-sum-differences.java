class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        int result[]=new int[nums.length];
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++)
        {
            leftsum[i]=left;
            left+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            rightsum[i]=right;
            right+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            result[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return result;
        
    }
}