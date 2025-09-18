class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<asteroids.length;i++)
       {
         while((!st.isEmpty())&&st.peek()>0&&asteroids[i]<0&&Math.abs(asteroids[i])>st.peek())
         {
            st.pop();
         }
         if((!st.isEmpty())&&st.peek()>0 && asteroids[i]<0 && Math.abs(asteroids[i])<st.peek() )
         {
            continue;
         }
         else if((!st.isEmpty())&&st.peek()>0 && asteroids[i]<0&& Math.abs(asteroids[i])==st.peek() )
         {
            st.pop();
            continue;
         }
         else
         {
            st.push(asteroids[i]);
         }
       }
        int result[]=new int[st.size()];
        for(int i=result.length-1;i>=0;i--)
        {
            result[i]=st.pop();
        }
        return result;
    }
}