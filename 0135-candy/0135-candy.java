class Solution {
    public int candy(int[] ratings) {
    int n = ratings.length;
    if(n<=1){
        return 1;
    }
    
    int [] ans1 =new int [n];
    int [] ans2 = new int [n];
    Arrays.fill(ans1,1);
    Arrays.fill(ans2,1);
    // Check for left to right constraint 
    for(int i=1 ;i<n ;i++){
        if(ratings[i]>ratings[i-1]){
            ans1[i]=ans1[i-1]+1;
        }
    }
    // Check for right to left constrint ;
    for(int i=n-2;i>=0 ;i--){
        if(ratings[i]>ratings[i+1]){
            ans2[i]=ans2[i+1]+1;
        }
    }
    int sum =0 ;
    for(int i= 0 ;i<n;i++){
        sum+=Math.max(ans1[i],ans2[i]);
    }
    return sum ;
}
    }