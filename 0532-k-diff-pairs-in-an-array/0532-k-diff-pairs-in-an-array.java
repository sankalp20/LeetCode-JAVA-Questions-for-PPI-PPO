class Solution {
    public int findPairs(int[] nums, int k) {
       
        int n = nums.length;
        Arrays.sort(nums);
       
        int  i =0;
        int j = i+1;
int findpairs = 0;
        while(j<n && i<n ){
            if(i==j){
                j++;
            }
            else{
            if(nums[j]-nums[i]==k){
                findpairs++;
                i++;
                while (i < n && nums[i] == nums[i - 1]){
            i++;}
            }else if(nums[j]-nums[i]>k){
                i++;
            }else{
                j++;
            }
        }
        }
        return findpairs;
    }
}

// class Solution {
//     public int findPairs(int[] nums, int k) {
//         int n = nums.length;
//         Arrays.sort(nums);
        
//         int i = 0;
//         int j = i+1;
        
//         int findPairs = 0;
        
//         while(i < n && j < n){
//             if(i == j) j++;
//         }
//         else if(nums[j] - nums[i] == k){
//             findPairs++; i++;
//             while( i<n && nums[i] == nums[i-1]) {
//             i++;
//             }
//         }
//         else if(nums[j] - nums[i] > k){
//             i++;
//         }
//         else {
//                 j++;
//             }
        
//     return findPairs;
//     }
// }

