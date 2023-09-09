class Solution {
    public int combinationSum4(int[] nums, int target) {
        int sumCount[] = new int[target+1];
        sumCount[0] = 1;
        int n = nums.length;
        
        for(int sum = 1; sum <= target; sum++){
            for(int indx = 0; indx < n; indx++){
                if(nums[indx] <= sum){
                    sumCount[sum] = (sumCount[sum] + sumCount[sum-nums[indx]]);
                }
            }
        }
        return sumCount[target];
        }
    }
