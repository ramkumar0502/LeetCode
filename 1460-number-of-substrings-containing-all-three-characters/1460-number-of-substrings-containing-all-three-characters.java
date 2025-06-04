class Solution {
    public int numberOfSubstrings(String s) {
        int temp[]=new int[3];
        int right=0;
        int res=0;
        int left=0;
        while(right<s.length())
        {
            temp[s.charAt(right)-'a']++;
            while(temp[0]>0 && temp[1]>0 && temp[2]>0)
            {
                res+=s.length()-right;
                temp[s.charAt(left)-'a']--;
                left++;

            }
            right++;
        }
        return res;

        
    }
}