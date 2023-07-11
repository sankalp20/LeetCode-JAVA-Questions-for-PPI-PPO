class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            totalSum += nums[i];
        }
        int leftSum = 0; int rightSum = totalSum;
        
        for(int i = 0; i < n; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}