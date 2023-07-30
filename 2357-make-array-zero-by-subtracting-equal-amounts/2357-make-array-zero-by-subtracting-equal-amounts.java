class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                int curr = nums[i];
                count++;
            
            for(int j = i; j < n; j++){
                nums[j] -= curr;
            }
        }
        }
        return count;
    }
}
