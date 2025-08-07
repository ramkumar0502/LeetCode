class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int ple[]=new int[arr.length];
        int nle[]=new int[arr.length];
   
        int MOD = 1000000007;
        for(int i=0;i<arr.length;i++)
        {
            while((!st.isEmpty()) &&  arr[i]<arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty() )
            {
                ple[i]=i-st.peek();
            }
           else
            {
                ple[i]=i+1;
            }
            st.push(i);
        }
        st.clear();
        for(int i=arr.length-1;i>=0;i--)
        {
            while((!st.isEmpty())&& arr[i]<=arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                nle[i]=st.peek()-i;
            }
            else
            {
                nle[i]=arr.length-i;
            }
            st.push(i);
        }

        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            long prod = ((long) arr[i] * ple[i] * nle[i]) % MOD;
            total = (total + prod) % MOD;
        }

        return (int) total;
        
    }
}