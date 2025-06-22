class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> obj=new ArrayList<>();
        String val="";
        int count=0;
        int start=0;
        while(start<s.length())
        {
            val=val+s.charAt(start);
            count++;
            if(count==k)
            {
                obj.add(val);
                count=0;
                 val="";
            }
            start++;
        }
        if(count!=0)
        {
            int add=k-count;
            for(int i=0;i<add;i++)
            {
                val=val+fill;
            }
            obj.add(val);
        }
       String result[]=new String[obj.size()];
       int arrc=0;
       for(String res:obj)
       {
        result[arrc++]=res;
       }
       return result;
        
    }
}