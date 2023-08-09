class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length - 1;
            
            while(left < right){
                if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else if(nums[i] + nums[left] + nums[right]> 0){
                    right--;
                }
                else {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    
                    while(nums[left] == nums[left - 1] && left < right)
                        left++;
                }
            }
        }
        return triplets;
    }
}