class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        if(!s.isEmpty() && t.isEmpty())
        {
            return false;
        }
        if(s.isEmpty()&& !t.isEmpty())
        {
            return true;
        }
        if(s.isEmpty() && t.isEmpty())
        {
            return true;
        }
        for(int i=0;i<t.length();i++)
        {
            if(count<s.length())
            {
            if(t.charAt(i)==s.charAt(count))
            {
                count++;
            }
            }
        }
        if(count==s.length())
        {
            return true;
        }
        return false;
        
    }
}