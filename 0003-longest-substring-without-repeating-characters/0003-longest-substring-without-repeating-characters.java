class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> obj=new HashMap<>();
       int right=0;
       int left=0;
       int maxlength=Integer.MIN_VALUE;
       if(s.length()==0||s.length()==1)
       {
        return s.length();
       }
       while(right<s.length())
       {
        obj.put(s.charAt(right),obj.getOrDefault(s.charAt(right),0)+1);
        while(obj.get(s.charAt(right))>1)
        {
            obj.put(s.charAt(left),obj.getOrDefault(s.charAt(left),0)-1);
            left++;
        }
        maxlength=Math.max(maxlength,right-left+1);
        right++;
        
       }
       return maxlength;
       
}
}