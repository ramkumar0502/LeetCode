class Solution {
    public int maxFreqSum(String s) {
        return findfrequency(s);  
    }
    public static int findfrequency(String s)
    {
        int vowel_max=0;
        int consonant_max=0;
        int vowel_array[]=new int[26];
        int consonant_array[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
            int ch=s.charAt(i)-'a';
            vowel_array[ch]++;
            }
            else
            {
                consonant_array[s.charAt(i)-'a']++;
            }
        }
        
        for(int val:vowel_array)
        {
            if(val>vowel_max)
            {
                vowel_max=val;
            }
        }
        for(int val:consonant_array)
        {
            if(val>consonant_max)
            {
                consonant_max=val;
            }

        }
        return vowel_max + consonant_max;

    }
}