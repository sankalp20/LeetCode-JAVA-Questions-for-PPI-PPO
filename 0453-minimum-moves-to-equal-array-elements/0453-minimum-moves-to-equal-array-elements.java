class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int min = nums[0];
        int n = nums.length;
        
        for(int i=0; i < n; i++){
            if(nums[i] < min)
                min = nums[i];
        }
        
        for(int i=0; i < n; i++){
            count += nums[i] - min;
        }
        return count;
    }
}