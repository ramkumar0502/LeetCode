class Solution {
    public int maximumLengthSubstring(String s) {
    Map<Character,Integer>obj=new HashMap<>();
    int left=0;
    int right=0;
    int maxfreq=0;
    int maxlength=0;
     while(right<s.length())
     {
        char c=s.charAt(right);
        obj.put(c,obj.getOrDefault(c,0)+1);
        while(obj.get(c)>2)
        {
            char leftc=s.charAt(left);
            obj.put(leftc,obj.getOrDefault(leftc,0)-1);
             left++;
        }
     
            maxlength=Math.max(maxlength,right-left+1);
    
        right++;
     }
     return maxlength;
        
    }
}