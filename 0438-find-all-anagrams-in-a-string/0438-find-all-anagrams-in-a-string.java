class Solution {
  
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int index;
        int count = 0;

        for(int i = 0; i < p.length(); i++) {
            if(map.containsKey(p.charAt(i))) {
                map.put(p.charAt(i), map.get(p.charAt(i)) + 1);
            }
            else {
                map.put(p.charAt(i), 1);
                count++;
            }
        }

        int k = p.length();
        int start = 0;
        int end = 0;

        while(end < s.length()) {

            char chStart = s.charAt(start);
            char chEnd = s.charAt(end);
            
            if(map.containsKey(chEnd)) {
                map.put(chEnd, map.get(chEnd) - 1);

                if(map.get(chEnd) == 0) {
                    count--;
                }
                
            }
            if(end - start + 1 < k) {

                end++;
            }

            else {
                if(count == 0) {
                    list.add(start);
                }
                if(map.containsKey(chStart)) {
                    map.put(chStart, map.get(chStart) + 1);
                    if(map.get(chStart) == 1) {
                        count++;
                    }
                }
                start++;
                end++;
            }
        }
        return list;

    }
}