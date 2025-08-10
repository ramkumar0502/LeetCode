class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxarea=Integer.MIN_VALUE;
        int cal=0;
        for(int i=0;i<heights.length;i++)
        {
            
            while(! st.isEmpty() &&heights[st.peek()]>heights[i])
            {
                int index=st.pop();
                if(st.isEmpty())
                {
                    cal=heights[index]*(i-(-1)-1);
                }
                else
                {
                    cal=heights[index]*(i-st.peek()-1);
                }
                maxarea=Math.max(cal,maxarea);
               
            }
            st.push(i);
            
        }
        while(!st.isEmpty())
        {
            int n=heights.length;
            int current=st.pop();
             if(st.isEmpty())
                {
                    cal=heights[current]*(n-(-1)-1);
                }
                else
                {
                    cal=heights[current]*(n-st.peek()-1);
                }
            maxarea=Math.max(cal,maxarea);
        }
        return maxarea;
        
    }
}