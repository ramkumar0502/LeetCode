class Solution {
    public int lengthOfLongestSubstring(String s) {
      int charArr[]=new int[128];
      int right=0;
      int left=0;
      int maxLength=0;
     if (s == null || s.isEmpty()) {
            return 0;
        }

      while(right<s.length())
      {
         int inc=s.charAt(right);
         charArr[inc]++;
         while(charArr[inc]>1)
         {
            int dec=s.charAt(left);
            charArr[dec]--;
            left++;
         }
         maxLength=Math.max(right-left+1,maxLength);
         right++;
      }
      return maxLength;      
}
}