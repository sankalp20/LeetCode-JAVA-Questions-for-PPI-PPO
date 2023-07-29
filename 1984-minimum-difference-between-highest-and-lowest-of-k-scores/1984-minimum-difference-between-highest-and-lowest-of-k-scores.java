class Solution {
    public int minimumDifference(int[] nums, int k) {
        //This is a sliding window problem, The intution is we want the min possible difference
        // So if we sort the array then for the minimum we need to just check the neighbours so used sorting

        // Edge case
        if(k == 1){
            return 0;
        }

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = k-1;
        while(j < nums.length){
            min = Math.min(min, nums[j] - nums[i]); //Finding the min
            i++;
            j++;
        }
        return min;
    }
}