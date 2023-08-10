class Solution {
    
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        List<Integer> mostVisitedSectors = new ArrayList<>();
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                mostVisitedSectors.add(i);
            }
        } else {
            for (int i = 1; i <= end; i++) {
                mostVisitedSectors.add(i);
            }
            for (int i = start; i <= n; i++) {
                mostVisitedSectors.add(i);
            }
        }

        return mostVisitedSectors;
    }
}