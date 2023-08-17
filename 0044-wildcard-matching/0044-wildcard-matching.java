class Solution {
   public boolean isMatch(String s, String p) {
        Boolean [][] dp= new Boolean [s.length()+1][p.length()+1];
        return helper(s, p, 0, 0, dp);
    }

    private boolean helper(String s, String p, int i, int j, Boolean [][] dp) {

        if (i == s.length() && j == p.length()) return true; if (j == p.length()) return false;
        if(dp[i][j]!=null) return dp[i][j];

        boolean match = (i < s.length()) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?');
        
        // Handle '*' case
        if (p.charAt(j) == '*') {
            // Skip '*' and try to match the remaining part of p
            boolean skipStar = helper(s, p, i, j + 1, dp);
            // Use '*' to match one or more characters and try the next character of s
            boolean useStar = (i < s.length()) && helper(s, p, i + 1, j, dp);
            return dp[i][j]=skipStar || useStar;
}
        
        // If characters match or '?' is encountered, continue with the next characters of both strings
        if (match) return dp[i][j]=helper(s, p, i + 1, j + 1, dp);
        return dp[i][j]=false;
    }
}


// class Solution{
//     static boolean isAllStars(String s, int i){
//         for(int j = 1; j <= i; j++){
//             if(s.charAt(j-1) != '*')
//                 return false;
//         }
//         return true;
//     }
    
//     public boolean isMatch(String s, String p) {
//         int m = s.length();
//         int n = p.length();
//         Boolean[][] dp = new Boolean[m + 1][n + 1];
//         dp[0][0] = true;
        
//         for(int j = 1; j <= n; j++){
//             dp[0][j] = false;
//         }
        
//         for(int i = 1; i <= m; i++){
//             dp[i][0] = isAllStars(s, i);
//         }
//         for(int i = 1; i <= m; i++){
//             for(int j = 1; j <= n; j++){
//              if(s.charAt(i-1) == p.charAt(j-1) || s.charAt(i-1) == '?')
//                  dp[i][j] = dp[i-1][j-1];
            
//                 else {
//                     if(s.charAt(i-1) == '*')
//                         dp[i][j] = dp[i-1][j] || dp[i][j-1];
                    
//                     else dp[i][j] = false;   
//             }
//         }
//     }
//     return dp[m][n];
// }
// }
