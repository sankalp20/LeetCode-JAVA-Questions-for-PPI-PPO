class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        int num = 1;
        
        for(int i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || i == 0){
                    num = 1;
                    list.add(num);
                }else{
                    num = num * (i - j + 1) / j;
                    list.add(num);
                }
            }
            triangle.add(list);
        }
        return triangle;   
    }
}