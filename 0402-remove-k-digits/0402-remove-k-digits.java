class Solution {
    public String removeKdigits(String num, int k) {
        int count=0;
        Stack<Integer> st=new Stack<>();
        StringBuilder result=new StringBuilder();
        if(num.length()==k)
        {
            return "0";
        }
        for(int i=0;i<num.length();i++)
        {
            
            int val=num.charAt(i)-'0';
         
            while(!st.isEmpty() && count!=k && st.peek()>val)
            {
                st.pop();
                count++;
            }
            if(st.isEmpty()&& val==0)
            {
               continue; 
            }
            else
            {
            st.push(val);
            }

        }
        while(!st.isEmpty() && count!=k)
        {
            st.pop();
            count++;
        }
        if(st.isEmpty())
        {
            return "0";
        }
        while(!st.isEmpty())
        {
            result=result.append(st.pop());
        }
       return result.reverse().toString();
        
    }
}