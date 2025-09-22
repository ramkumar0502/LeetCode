class Solution {
    public int maxFrequencyElements(int[] nums) {
        int num[]=new int[101];
        for(int val:nums)
        {
            num[val]++;
        }
        Arrays.sort(num);
       int max=num[num.length-1];
       int count=1;
        for(int i=num.length-2;i>=0;i--)
        {
            if(num[i]==max)
            {
               count++;
            }

        }
        return max*count;
        
    }
}