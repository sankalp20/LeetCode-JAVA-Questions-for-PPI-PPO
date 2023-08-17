class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        
        setRowsZero(matrix, rowSet);
        setColsZero(matrix, colSet);
    }
        public void setRowsZero(int[][] matrix, Set<Integer> set){
            for(int i=0; i<matrix.length; i++){
                if(set.contains(i)){
                    for(int j=0; j<matrix[i].length; j++){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        
        public void setColsZero(int[][] matrix, Set<Integer> set){
            for(int i=0; i < matrix[0].length; i++){
                if(set.contains(i)){
                    for(int j = 0; j<matrix.length; j++){
                        matrix[j][i] = 0;
                    }
                }
            }
        }
    }
