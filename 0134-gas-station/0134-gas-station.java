class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currGain = 0, totalGain = 0, ans = 0;
        
        for(int i = 0; i < gas.length; ++i){
            totalGain += gas[i] - cost[i];
            currGain += gas[i] - cost[i];
            
            if(currGain < 0){
                ans = i + 1;
                currGain = 0;
            }
        }
        
        if(totalGain<0){
            return -1;
        }
        return ans;
    }
}