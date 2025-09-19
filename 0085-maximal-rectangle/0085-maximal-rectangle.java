class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int prefixsum[][] = new int[row][column]; 
        int sum; 

    
        for (int i = 0; i < column; i++) {
            sum = 0;
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] == '0') {
                    sum = 0; 
                    prefixsum[j][i] = 0;
                } else {
                    sum += 1; 
                    prefixsum[j][i] = sum;
                }
            }
        }

        int maxlength = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            maxlength = Math.max(maxlength, area(prefixsum[i]));
        }
        return maxlength;
    }

    public int area(int array[]) {
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;
        int current;
        int cal;

        for (int i = 0; i < array.length; i++) {
            while (!st.isEmpty() && array[st.peek()] > array[i]) {
                current = st.pop();
                if (st.isEmpty()) {
                    cal = array[current] * (i-(-1)-1);
                } else {
                    cal = array[current] * (i - st.peek() - 1);
                }
                max = Math.max(max, cal);
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int val = st.pop();
            int n = array.length;
            if (st.isEmpty()) {
                cal = array[val] * n;
            } else {
                cal = array[val] * (n - st.peek() - 1);
            }
            max = Math.max(max, cal);
        }
        return max;
    }
}
