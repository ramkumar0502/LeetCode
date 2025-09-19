class Solution {
    public int largestRectangleArea(int[] heights) {
    Stack<Integer> st=new Stack<>();
    int max=Integer.MIN_VALUE;
    int cal=0;
    for(int i=0;i<heights.length;i++)
    {
        while((!st.isEmpty())&&heights[st.peek()]>heights[i])
        {
            int val=heights[st.pop()];
            if(st.isEmpty())
            {
                max=Math.max(max,val*(i-(-1)-1));
            }
            else
            {
            max=Math.max(max,val*(i-st.peek()-1));
            }
        }
        st.push(i);
    }
    while(!st.isEmpty())
    {
       int n=heights.length;
       int val=heights[st.pop()];
       if(st.isEmpty())
       {
         max=Math.max(max,val*(n-(-1)-1));
       }
       else
       {
        max=Math.max(max,val*(n-(st.peek())-1));
       }
    }
    return max;
}
}