class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>obj=new HashMap<>();
        int right=0;
        while(right<nums.length)
        {
            if(!(obj.containsKey(nums[right])))
            {
              obj.put(nums[right],right);
            }
            else
            {
                int value=Math.abs(obj.get(nums[right])-right);
                if(value<=k)
                {
                    return true;
                }
                obj.put(nums[right],right);

            }
            right++;

        }
        return false; 

    }
}