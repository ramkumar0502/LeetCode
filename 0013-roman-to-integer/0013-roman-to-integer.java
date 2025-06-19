class Solution {
    public int romanToInt(String s) {
       
        Map<Character,Integer> obj=new HashMap<>();
        obj.put('I',1);
        obj.put('V',5);
        obj.put('X',10);
        obj.put('L',50);
        obj.put('C',100);
        obj.put('D',500);
        obj.put('M',1000);
        int total=0;
        int current=0;
        int previous=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            current=obj.get(s.charAt(i));
            if(current>=previous)
            {
                total=total+current;
            }
            else
            {
                total=total-current;
            }
            previous=current;
        }
        return total;
        
}
}