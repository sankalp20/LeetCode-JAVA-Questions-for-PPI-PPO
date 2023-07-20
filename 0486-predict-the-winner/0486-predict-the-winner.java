class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        return ans(nums, 0, n-1) >= 0;
    }
    
    // i = start, j = end
    private int ans(int[] nums, int i, int j){
        if(i == j) return nums[i];
    
    
    return Math.max(nums[i] - ans(nums, i+1, j), nums[j] - ans(nums, i, j-1));
}
}