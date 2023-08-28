class Solution {
    // Tabuation Code 
    // Time Complexity : O(n)
    // Space Complexity : O(n x sum)
    private static boolean fun(int[] nums, int sum){
        // Instantiate DP
        boolean[][] dp = new boolean[nums.length][sum+1];

        // Base Tabulations 
        for(int index=0;index<nums.length;index++) dp[index][0] = true;
        for(int s=0;s<=sum;s++) dp[0][s] = (nums[0]==s);

        // Tabulations 
        for(int index=1;index<nums.length;index++){
            for(int s=1;s<=sum;s++){
                // Not Pick
                boolean notPick = dp[index-1][s];

                // Pick
                boolean pick = false;
                if(nums[index]<=s) pick = dp[index-1][s-nums[index]];

                // Update DP
                dp[index][s] = notPick||pick;
            }
        }
        return dp[nums.length-1][sum];
    }

    public boolean canPartition(int[] nums) {
        int len = nums.length, totalSum = Arrays.stream(nums).sum();
        
        // Base Case 
        if(totalSum%2==1) {return false;}

        // Code 
        else {
            int sum = totalSum/2;
            return fun(nums,sum);
        }
    }
}

// sum1 + sum2 = sum
// sum1 == sum2
// sum1 == sum2 == sum/2