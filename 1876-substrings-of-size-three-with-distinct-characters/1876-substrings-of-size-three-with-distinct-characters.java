class Solution {
    public int countGoodSubstrings(String s) {
       int i = 0, j = 0, cnt = 0, k = 3;
        while(j < s.length()){
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k){
                if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) && s.charAt(i) != s.charAt(i+2))
                    cnt++;
                i++;
                j++;
            }
        }
        return cnt;
    }
}

// int i = 0, j = 0, k = 3, cnt = 0;
        
//         while(j < s.length()){
//             if( j - i + 1 < k)
//                 j++;
//             else if ( j - i + 1 == k) {
//                 if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) && s.charAt(i) != s.charAt(i+2))
//                     cnt++;
//                 i++;
//                 j++;
//             }
//         }
//         return cnt;