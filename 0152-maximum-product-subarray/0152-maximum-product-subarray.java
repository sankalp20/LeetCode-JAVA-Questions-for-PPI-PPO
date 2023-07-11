// class Solution {
//     public int maxProduct(int[] arr) {
//         int result = arr[0];
// 	    for(int i=0;i<arr.length-1;i++) {
// 	        int p = arr[i];
// 	        for(int j=i+1;j<arr.length;j++) {
// 	            result = Math.max(result,p);
// 	            p *= arr[j];
// 	        }
// 	        result = Math.max(result,p);
// 	    }
// 	   return result;     
// 	}
// }

class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
        
			// Swapping min and max
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
                


            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);


            ans = Math.max(ans, max);
        }
        
        return ans;

    }
}
