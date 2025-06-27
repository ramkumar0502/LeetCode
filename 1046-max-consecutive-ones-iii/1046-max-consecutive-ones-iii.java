class Solution {
    public int longestOnes(int[] nums, int k) {
       int right=0;
       int left=0;
       int count=0;
       int maxlength=0;
       while(right<nums.length)
       {
        if(nums[right]==0)
        {
            count++;
        }
        if(count>k)
        {
            while(count>k)
            {
                if(nums[left]==0)
                {
                    count--;
                }
                left++;
            }
        }
        if(count<=k)
        {
            maxlength=Math.max(maxlength,right-left+1);
        }
        right++;
       }
       return maxlength;
    }
}