class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int e = 0, o = n-1;
        
        for(int i : nums){
            if(i % 2 == 0){
                res[e] = i;
                e++;
            }else{
                res[o] = i;
                o--;
            }
        }
        return res;
    }
}