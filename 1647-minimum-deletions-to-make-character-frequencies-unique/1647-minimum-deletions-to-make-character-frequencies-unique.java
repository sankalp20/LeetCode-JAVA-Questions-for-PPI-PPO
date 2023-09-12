class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int cnt=0;
        HashSet<Integer>set=new HashSet<>();
        for(char ch:map.keySet()){
            int temp=map.get(ch);
            while(set.contains(temp)){
                map.put(ch,map.get(ch)-1);
                temp=map.get(ch);
                cnt++;
                if(temp==0){
                break;
                }
            }
            set.add(temp);
        }
        return cnt;
    }
}