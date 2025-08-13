class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        String result="";
        if(len==1||len==0)
        {
            return s;
        }
        for(int i=0;i<s.length();i++)
        {
            String len1=find(s,i,i,len);
            String len2=find(s,i,i+1,len);
            result=len1.length()>len2.length()?(len1.length()>result.length()?len1:result):(len2.length()>result.length()?len2:result);

        }
        return result;
    }
    public String find(String s,int left,int right,int len)
    {
        while(left>=0 && right<len && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}