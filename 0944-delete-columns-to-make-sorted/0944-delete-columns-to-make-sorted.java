class Solution {
    public int minDeletionSize(String[] strs) {
        // Define the strings length
        int K = strs[0].length();
        
        int ans = 0;
        
        // Now we need to iterate over each index in the string
        for(int col = 0; col < K; col++){
            // Iterate over the strings
            for(int row = 1; row < strs.length; row++){
                
    // Check if the characters are in increasing order, if not then increment the counter
                if(strs[row].charAt(col) < strs[row-1].charAt(col)){
                ans++;
                    break;
                }
            }
        }
        return ans;
    }
}