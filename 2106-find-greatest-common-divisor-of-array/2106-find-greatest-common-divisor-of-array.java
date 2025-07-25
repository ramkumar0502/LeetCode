class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return findgcd(nums[0],nums[nums.length-1]);
    }
    public int findgcd(int a,int b) 
    {
        int max=Integer.MIN_VALUE;
       
        for(int i=1;i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                if(i>max)
                {
                    max=i;
                }
            }
        }
        return max;
       
    }
}