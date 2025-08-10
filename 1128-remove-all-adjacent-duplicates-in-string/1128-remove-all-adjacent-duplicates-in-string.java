class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder br=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char val=s.charAt(i);
            if(! st.isEmpty()&&st.peek()==val)
            {
                st.pop();
                continue;
            }
            st.push(val);
        }
        while(!st.isEmpty())
        {
            br.append(st.pop());
        }
       return  br.reverse().toString();
    
    }
}