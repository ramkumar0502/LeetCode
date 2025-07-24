class Solution {
    public String reverseVowels(String s) {
       char arr[]=s.toCharArray();
       int start=0;
       int end=s.length()-1;
       while(start<end)
       {
        char c1=arr[start];
        char c2=arr[end];
        if(isVowels(c1)&&isVowels(c2))
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        else if(isVowels(c1)&& !isVowels(c2))
        {
            end--;
        }
        else if(!isVowels(c1)&& isVowels(c2))
        {
            start++;
        }
        else
        {
            start++;
            end--;
        }

       }
       String str=new String(arr);
       return str;
       }
       public boolean isVowels(char ch)
       {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            return true;
        }
        return false;
       }
    }
