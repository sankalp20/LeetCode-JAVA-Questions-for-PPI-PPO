class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // using two pointer system
        int n = nums.length;
        int left = 0;
        int right = n-1;
        
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] < pivot) 
                res[left++] = nums[i];
            
            if(nums[n - 1 - i] > pivot)
                res[right--] = nums[n-i-1];
        }
        while(left <= right){
            res[left++] = pivot;
        }
        return res;
    }
}