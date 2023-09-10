class Solution {
    public int countOrders(int n) {
        int mod = 1000000007;
        if (n == 1) {
            return 1;
        }
        int getLastCount = countOrders(n - 1);
        int noOfPossiblePositions = 2 * (n - 1) + 1;
        long noOfTotalPossiblePositions = (long) (((long) noOfPossiblePositions * (noOfPossiblePositions + 1)) / 2) % mod;
        return (int) ((getLastCount * noOfTotalPossiblePositions) % mod);
    }
}