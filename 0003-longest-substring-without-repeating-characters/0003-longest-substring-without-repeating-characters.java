class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map<Character,Integer> obj=new HashMap<>();
      int right=0;
      int left=0;
      int max=0;
      while(right<s.length())
      {
         obj.put(s.charAt(right),obj.getOrDefault(s.charAt(right),0)+1);
         while(obj.get(s.charAt(right))>1)
         {
             obj.put(s.charAt(left),obj.getOrDefault(s.charAt(left),0)-1);
             left++;
         }
         max=Math.max(max,right-left+1);
         right++;

      }
      return max;
        
    }
}