class Solution {
    public int trap(int[] height) {
      int n=height.length;
      int[] pre=new int[n];
      int[] suf=new int[n];
      pre[0]=height[0];
      for(int i=1;i<n;i++){
         if(height[i]>pre[i-1])
             pre[i]=height[i];
         else
             pre[i]=pre[i-1];
      } 
      suf[n-1]=height[n-1];
      for(int i=n-2;i>=0;i--){
         if(height[i]>suf[i+1])
             suf[i]=height[i];
         else
             suf[i]=suf[i+1];
      }
      int s=0;
      for(int i=0;i<n;i++)
        s+=Math.min(pre[i],suf[i])-height[i];
      return s;
    }
}