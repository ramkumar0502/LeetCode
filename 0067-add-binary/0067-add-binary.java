class Solution {
    public String addBinary(String a, String b) {
        StringBuffer br=new StringBuffer();
        int length=a.length()-1;
        int length2=b.length()-1;
        int remainder=0;
        int sum=0;
        while(length>=0 || length2>=0 || remainder!=0)
        {
            sum=remainder;
           if(length>=0)
           {
            sum=sum+a.charAt(length)-'0';
             
           }
           if(length2>=0)
           {
            sum=sum+b.charAt(length2)-'0';
           }
           br.append(sum%2);
           remainder=sum/2;
            length--;
            length2--;

        }
        br.reverse();
        return br.toString();
    }
}