class Solution {
    public int sumSubarrayMins(int[] arr) {
        int nse[]=new int[arr.length];
        int pse[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int mod=1000000007;
        for(int i=0;i<arr.length;i++)
        {
            while((!st.isEmpty())&&arr[st.peek()]>arr[i])
            {
                st.pop();
            }
            pse[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=arr.length-1;i>=0;i--)
        {
            while((!st.isEmpty())&& arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            nse[i]=st.isEmpty()?arr.length-i:st.peek()-i;
            st.push(i);
        }
          long ans = 0;
        for (int i = 0; i <arr.length; i++) {
            long contribution = (long) arr[i] * pse[i] * nse[i];
            ans = (ans + contribution) % mod;
        }

        return (int) ans;
        
    }
}