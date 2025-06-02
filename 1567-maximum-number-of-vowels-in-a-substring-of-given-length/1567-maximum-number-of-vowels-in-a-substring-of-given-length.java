class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int right=k;
        int count=0;
        int maxcount=0;
        for(int i=0;i<right;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                count++;

            }
        }
        maxcount=Math.max(count,maxcount);
        while(right<s.length())
        {
            if(s.charAt(right)=='a'||s.charAt(right)=='e'||s.charAt(right)=='i'||s.charAt(right)=='o'||s.charAt(right)=='u')
            {
                count++;
            }
            if(s.charAt(left)=='a'||s.charAt(left)=='e'||s.charAt(left)=='i'||s.charAt(left)=='o'||s.charAt(left)=='u')
            {
                count--;
            }
            left++;
             maxcount=Math.max(count,maxcount);
             right++;

        }
        return maxcount;
        
    }
}