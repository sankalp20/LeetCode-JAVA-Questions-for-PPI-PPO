class Solution {
    public int findPeakElement(int[] nums) {
        
        //-------------------- Optimal Approach ----------------//
//         int n = arr.length;
//         if (n==1) return arr[0];
//         if(arr[0] > arr[1]) return arr[0];
//         if(arr[n-1] > arr[n-2]) return arr[n-1];
        
//         int low = 1; int high = n-2;
        
//         while(low <= high){
//         int mid = (low + high)/2;
            
//             if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){ 
//                 return mid;
//             }
//             else if(arr[mid] > arr[mid-1])
//                 low = mid+1;
            
//             else
//                 high = mid - 1;
            
//         }
//         return -1;
        
        //----------------------- Brute Force Approach-------------// 
        
//         if (arr[0] >= arr[1])
//       return arr[0];

//     for (int i = 1; i < n - 1; i++)
//       if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
//         return arr[i];

//     return arr[n - 1];
        

        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                e= mid;
            }else{
                s=mid+1;
            }
        }
        return e;
    }
}
