class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int start=0;
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
        recursive(nums,result,temp,start,n);
        return result;
    }
    public static void recursive(int nums[],List<List<Integer>> result,List<Integer> temp,int start,int n)
    {
         result.add(new ArrayList<>(temp));
        for(int i=start;i<n;i++)
        {
            if(i>start && nums[i]==nums[i-1])
            {
                continue;
            }
            temp.add(nums[i]);
            recursive(nums,result,temp,i+1,n);
            temp.remove(temp.size()-1);
        }
    }
}