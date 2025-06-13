class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String ans=words[i];
            String pal="";
            for(int j=ans.length()-1;j>=0;j--)
            {
                pal=pal+ans.charAt(j);
            }
            if(ans.equals(pal))
            {
                return ans;
            }
        }
        return "";
        
    }
}