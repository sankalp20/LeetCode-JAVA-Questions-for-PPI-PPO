class Solution {
    public int jump(int[] nums) {
        long[] memo = new long[nums.length];
        Arrays.fill(memo, -1);
        return (int) slv(0, nums, memo);
    }

    private long slv(int n, int[] jumps, long[] memo) {
        if (n == jumps.length - 1) return 0;
        if (memo[n] != -1) return memo[n];
        long min = Integer.MAX_VALUE;
        for (int i = n + 1; i <= Math.min(jumps.length - 1, n + jumps[n]); i++)
            min = Math.min(min, 1 + slv(i, jumps, memo));
        return memo[n] = min;
    }
}