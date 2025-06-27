class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countsubarray(nums,k)-countsubarray(nums,k-1);
    }
    public int countsubarray(int nums[],int limit)
    {
        if(limit<0)
        {
            return 0;
        }
        int count=0;
        int right=0;
        int left=0;
        int subcount=0;
        while(right<nums.length)
        {
            if((nums[right]& 1)!=0)
            {
                count++;
            }
            while(count>limit)
            {
                 if((nums[left]&1)!=0)
            {
                count--;
            }
            left++;
            }
            if(count<=limit)
            {
                subcount=subcount+right-left+1;

            }
            right++;
        }
        return subcount;
    }
}