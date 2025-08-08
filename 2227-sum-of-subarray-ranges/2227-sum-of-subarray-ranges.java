class Solution {
    public long subArrayRanges(int[] nums) {
        return maxsubarray(nums) - minsubarray(nums);
    }

    public long minsubarray(int[] arr) {
        int n = arr.length;
        long total = 0;
        Stack<Integer> st = new Stack<>();
        int[] ple = new int[n];
        int[] nle = new int[n];

  
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            ple[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nle[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            total += 1L * arr[i] * ple[i] * nle[i];
        }
        return total;
    }

    public long maxsubarray(int[] arr) {
        int n = arr.length;
        long total = 0;
        Stack<Integer> st = new Stack<>();
        int[] pge = new int[n];
        int[] nge = new int[n];

      
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();


        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            total += 1L * arr[i] * pge[i] * nge[i];
        }
        return total;
    }
}
