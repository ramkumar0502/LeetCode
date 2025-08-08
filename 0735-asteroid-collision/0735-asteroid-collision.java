class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            if( (!st.isEmpty()) && st.peek()>0 && asteroids[i]<0)
            {
                while((!st.isEmpty()) && st.peek()>0 && Math.abs(asteroids[i])>st.peek())
                {
                    st.pop();
                }
                if((!st.isEmpty())&& st.peek()>0 && asteroids[i]<0)
                {
                   if(st.peek()==Math.abs(asteroids[i]))
                   {
                   st.pop();
                   continue;
                   }
                   if(st.peek()>Math.abs(asteroids[i]))
                   {
                      continue;
                   }
                }
               
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
            }
           
            else
            {
                st.push(asteroids[i]);

            }
        }
        int result[]=new int[st.size()];
        for(int i=result.length-1;i>=0;i--)
        {
            result[i]=st.peek();
            st.pop();
        }
        return result;


        
    }
}