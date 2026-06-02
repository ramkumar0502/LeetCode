class Solution {
    public boolean isPalindrome(int x) {
        
        String val=String.valueOf(x);
    

        int left=0;
        int right=val.length()-1;

        while(left<right)
        {
           if(val.charAt(left)==(val.charAt(right)))
           {
            left++;
            right--;
           }
           else
           {
            return false;
           }
        }
         return true;
    }
}