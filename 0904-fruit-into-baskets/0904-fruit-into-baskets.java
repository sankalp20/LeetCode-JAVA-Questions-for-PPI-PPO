class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0, j = 0;
        int ans = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        while (j < fruits.length) {
            basket.put(fruits[j], 1 + basket.getOrDefault(fruits[j], 0));
            while (basket.size() > 2) {
                basket.put(fruits[i], basket.get(fruits[i]) - 1); 
                if (basket.get(fruits[i]) == 0) {    
                    basket.remove(fruits[i]);
                }
                i++;   
            }
            ans = Math.max(ans, j - i + 1); 
            j++;    
        }

        return ans;  
    }
}



// class Solution {
//     public int totalFruit(int[] fruits) {
//         int n = fruits.length;
//         int ans = 0;
//         for(int i =0; i <n; i++){
//         HashSet<Integer> basket = new HashSet<>();
        
//         int j = i;
//         for(; j < n; j++){
//             if(basket.size() == 2 && !basket.contains(fruits[i])){
//                 break;
//             }
//         basket.add(fruits[i]);
//     }
        
//     ans = Math.max(ans, j - i);
// }
//         return ans;
// }
// }

