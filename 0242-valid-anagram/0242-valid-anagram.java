class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        
        Arrays.sort(cs);
        Arrays.sort(ct);
        
        return Arrays.equals(cs,ct);
    }
}