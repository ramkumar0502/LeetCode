class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Character>obj=new HashMap<>();
          Map<Character,Character>obj2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(obj.containsKey(s.charAt(i))&& obj.get(s.charAt(i))!=t.charAt(i))
            {
                return false;

            }
            else
            {
            obj.put(s.charAt(i),t.charAt(i));
            }
            if(obj2.containsKey(t.charAt(i))&& obj2.get(t.charAt(i))!=s.charAt(i))
            {
                return false;
            }
            else
            {
                obj2.put(t.charAt(i),s.charAt(i));
            }


           
        }
       
        return true;
    }
       

}