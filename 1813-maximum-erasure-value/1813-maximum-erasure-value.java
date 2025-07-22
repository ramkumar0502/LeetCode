class Solution {
    public int maximumUniqueSubarray(int[] nums) {   
        int right=0;
        int left=0;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        Map<Integer,Integer>obj=new HashMap<>();
        while(right<nums.length)
        {
            
             obj.put(nums[right],obj.getOrDefault(nums[right],0)+1);
             sum+=nums[right];
              while(obj.get(nums[right])>1)
            {
                obj.put(nums[left],obj.getOrDefault(nums[left],0)-1);
                sum=sum-nums[left];
                left++;
            }

            maxsum=Math.max(maxsum,sum);
            right++;

        }
        return maxsum;
     

        
    }
}