// class Solution {
//     public int singleNonDuplicate(int[] arr) {
//         int n = arr.length;
//         if(n == 1) return arr[0];
//         if(arr[0] != arr[1]) return arr[0];
//         if(arr[n-1] != arr[n-2]) return arr[n-1];
        
//        int low = 1, high = n-2;
        
//         while(low <= high){
//           int mid = (low + high)/2;
            
//             if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                
//                 //checking the left and right side
//                 if((mid % 2 == 1) && (arr[mid-1] == arr[mid]) || (mid % 2 == 0) && (arr[mid] == arr[mid + 1])){
//                     low = mid + 1; //eliminating the left side
//                 } else 
//                     high = mid -1; // eliminating the right side
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}