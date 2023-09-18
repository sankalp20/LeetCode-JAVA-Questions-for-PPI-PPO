class Solution {
    public int[] kWeakestRows(int[][] matrix, int k) {
        // Using a set to store pairs of the sum of soldiers and their respective row indices
        TreeSet<int[]> soldierSet = new TreeSet<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);
                else
                    return Integer.compare(a[1], b[1]);
            }
        });

        // Calculate the sum of soldiers for each row and store in the set
        for (int row = 0; row < matrix.length; row++) {
            int soldierCount = findSoldierCount(matrix[row]);
            soldierSet.add(new int[]{soldierCount, row});
        }

        // Get the k weakest rows from the set
        int[] weakestRows = new int[k];
        Iterator<int[]> iterator = soldierSet.iterator();
        for (int i = 0; i < k; i++) {
            weakestRows[i] = iterator.next()[1];
        }

        return weakestRows;
    }

    private int findSoldierCount(int[] row) {
        int left = 0, right = row.length - 1;

        // Perform binary search to find the count of soldiers
        while (left <= right) {
            int mid = (left + right) / 2;
            if (row[mid] == 1)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left;
    }
}