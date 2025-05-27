class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<seats.length;i++)
        {
            int val=seats[i]-students[i];
            sum=sum+Math.abs(val);

        }
        return sum;
        
    }
}