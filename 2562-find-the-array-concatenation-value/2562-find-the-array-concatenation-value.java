class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int i = 0;
        int j = nums.length - 1;
        while(i <= j)
        {
            String s = Long.toString(nums[i]);
            String st = Long.toString(nums[j]);
            s = s + st;
            if(i == j)
            {
                sum += nums[i];
            }   
            else
            {
                sum = sum + Long.parseLong(s);
                // System.out.println(sum);
            }
            i++;
            j--;
        }
        return sum;

    }
}