class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>obj=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(obj.containsKey(nums[i]))
            {
                if(i-obj.get(nums[i])<=k)
                {
                    return true;
                }
            }
            obj.put(nums[i],i);
        }
        return false;

    }
}