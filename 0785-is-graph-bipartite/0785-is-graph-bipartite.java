class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length; 
        int[] states = new int[n];
        for (int i = 0; i < n; i++) {
            if (states[i] != 0) continue;
            if (!dfs(graph, states, 1, i)) return false;
        }
        
        return true;
    }
    
    // traverse and validate
    private boolean dfs(int[][] graph, int[] states, int state, int node) {
        if (states[node] != 0) return states[node] == state;
        if (graph[node].length == 0) return true;
        
        states[node] = state;
        
        for (int val : graph[node]) {
            if (!dfs(graph, states, - state, val)) return false;
        }
        return true;
 
    }
}