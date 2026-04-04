class LRUCache {
HashMap<Integer, Integer> map;
    public LRUCache(int capacity) {
        map = new HashMap<>();

    }
    
    public int get(int key) {
       for(int num: map.keySet()){
        if(num == key){
            int val = map.get(num);
            map.remove(num);
            return val;
            
        }
       } 
       return -1;
    }
    
    public void put(int key, int value) {
      map.put(key, value);  
    }
}
