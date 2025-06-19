class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> obj=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character value=s.charAt(i);
            obj.put(value,obj.getOrDefault(value,0)+1);
        }
        StringBuilder br=new StringBuilder();
        Queue<Character> q=new PriorityQueue<>((a,b)->obj.get(b)-obj.get(a));
        q.addAll(obj.keySet());
        while(!q.isEmpty())
        {
            char ans=q.poll();
            int freq=obj.get(ans);
            for(int i=0;i<freq;i++)
            {
                br.append(ans);
            }

        }
        return br.toString();
       
        
        
    }
}