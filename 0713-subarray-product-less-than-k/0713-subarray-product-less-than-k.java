class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        double product = 1;
        int n = nums.length;
        int res = 0;
        
        for(int j = 0; j < n; j++){
            product = product * nums[j];
            
            while(i <= j && product >= k){
                product = product /nums[i];
                i++;
            }
            res += j-i+1;
        }
        return res;
    }
}