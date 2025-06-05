class Solution {
    public int firstUniqChar(String s) {
        int ans=0;
        Map<Character,Integer>obj=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            obj.put(s.charAt(i),obj.getOrDefault(s.charAt(i),0)+1);
        }
       for(int i=0;i<s.length();i++)
       {
        if(obj.get(s.charAt(i))==1)
        {
           ans=i;
           return ans; 
        }
       }
        return -1;
    }
}