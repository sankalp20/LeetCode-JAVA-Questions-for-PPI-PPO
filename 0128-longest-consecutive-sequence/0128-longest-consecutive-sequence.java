class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxCount = 1; int checkMaxCount = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                checkMaxCount++;
            }
            else if(nums[i] != nums[i-1]){
                checkMaxCount = 1;
            }
            if(checkMaxCount > maxCount){
                maxCount = checkMaxCount;
            }
        }
        return maxCount;
    }
}