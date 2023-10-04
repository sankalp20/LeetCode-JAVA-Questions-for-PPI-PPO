class MyHashMap {
    
    //Initialization of HashMap
    int[] map;

    public MyHashMap() {
        
        //Fill the array as -1
        map = new int[1000001];
        
        // Filling array with -1
        Arrays.fill(map, -1);
    }
    
    // Given the index key, we put the value at the index of Map array.
    public void put(int key, int value) {
        map[key] = value;
        
    }
    
    // Now we return the key, the value at the particular index. If the map is empty, we will return -1, for that fill the array first with -1.
    public int get(int key) {
        return map[key];
        
    }
    
    // //To remove an key,simply put -1 at that index
    public void remove(int key) {
        map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */