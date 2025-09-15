class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String array[]=text.split(" ");
        int count=0;
        for(String val:array)
        {
            for(int i=0;i<brokenLetters.length();i++)
            {
                if(val.contains(String.valueOf(brokenLetters.charAt(i)))){
                count++;
                break;
                }
            }
            
        }
        return array.length-count;

        
    }
}