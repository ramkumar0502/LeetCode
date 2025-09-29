class LFUCache {
     class Node{
        int key;
        int value;
        int freq;
        Node next,prev;
        public Node(int k,int v)
        {
            key=k;
            value=v;
            freq=1;
            this.next=null;
            this.prev=null;
        }
     }
     Map<Integer,Node>cache;
     Map<Integer,LinkedHashSet<Node>>freq;
     Node head;
     Node tail;
     int capacity,minfreq;
     public LFUCache(int capacity)
     {
        this.capacity=capacity;
        cache=new HashMap<>();
        freq=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        minfreq=0;
        head.next=tail;
        tail.prev=head;
     }
    
    public int get(int key) {
      if(!(cache.containsKey(key))) return -1;

      Node node=cache.get(key);
      updateFrequency(node);
      return node.value; 
    }
    
    public void put(int key, int value) {
    if (capacity == 0) return;

    if (cache.containsKey(key)) {
        Node node = cache.get(key);
        node.value = value;
        updateFrequency(node);
    } else {
        if (cache.size() == capacity) {
            LinkedHashSet<Node> setnode = freq.get(minfreq);
            Node deletenode = setnode.iterator().next();
            cache.remove(deletenode.key);
            setnode.remove(deletenode);
        }
        Node newnode = new Node(key, value);
        cache.put(key, newnode);
        minfreq = 1;
        freq.computeIfAbsent(newnode.freq, k -> new LinkedHashSet<>()).add(newnode);
    }
}

   public void updateFrequency(Node node) {
    int frequency = node.freq;
    LinkedHashSet<Node> setnode = freq.get(frequency);
    setnode.remove(node);
    if (setnode.isEmpty() && frequency == minfreq) {
        minfreq++;
    }

    node.freq++;
    freq.computeIfAbsent(node.freq, k -> new LinkedHashSet<>()).add(node);
}

   
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */