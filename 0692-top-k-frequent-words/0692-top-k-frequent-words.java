class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer> map = new HashMap<>();
        //   putting all String from words array in map
        for(String s: words) map.put(s , map.getOrDefault(s,0)+1);
        //puting all key values into list from map
        List<String> list = new ArrayList(map.keySet());
        
        // if(string ad another string is equal hen its sort with lexicograpically)
        // else(sort with desending order using str frequency)
        Collections.sort(list, (i, j) -> map.get(i).equals(map.get(j)) ?
                         i.compareTo(j) : map.get(j) - map.get(i));
        return list.subList(0,k);
    }
}