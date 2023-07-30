class Solution {
    public int longestSubarray(int[] nums, int limit) {

    int i = 0, j;
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (j = 0; j < nums.length; j++) {
        map.put(nums[j], 1 + map.getOrDefault(nums[j], 0));
        if (map.lastEntry().getKey() - map.firstEntry().getKey() > limit) {
            map.put(nums[i], map.get(nums[i]) - 1);
            if (map.get(nums[i]) == 0)
                map.remove(nums[i]);
            i++;
        }
    }
    return j - i;
}
}