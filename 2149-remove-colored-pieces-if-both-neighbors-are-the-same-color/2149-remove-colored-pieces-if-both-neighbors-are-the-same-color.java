class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('A', 0);
        mp.put('B', 0);

        for(int i = 0; i < n; i++){
            char x = colors.charAt(i);
            int count = 0;

            while(i < n && colors.charAt(i) == x){
                i++;
                count++;
            }
            mp.put(x, mp.get(x) + Math.max(count - 2, 0));
            i--;
        }
        return mp.get('A') > mp.get('B');
    }
}