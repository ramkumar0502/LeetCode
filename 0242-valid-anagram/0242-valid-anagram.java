class Solution {
    public boolean isAnagram(String s, String t) {
      int arr[]=new int[26];
      if(s.length()!=t.length())
      {
        return false;
      } 

      for(int i=0;i<s.length();i++)
      {
        int val=s.charAt(i)-'a';
        arr[val]++;
        int val1=t.charAt(i)-'a';
        arr[val1]--;
      }
      for(int ans:arr)
      {
        if(ans>0)
        {
            return false;
        }
      }
      return true;

        
    }
}