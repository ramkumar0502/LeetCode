class MyHashSet {

        private static final Object PRESENT=new Object();
         Map<Integer,Object>obj2;
    public MyHashSet() {
      obj2 =new HashMap<>();
    }
    
    public void add(int key) {
        obj2.put(key,PRESENT);    
    }
    
    public void remove(int key) {
        obj2.remove(key);
    }
    
    public boolean contains(int key) {
      return obj2.containsKey(key);

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */