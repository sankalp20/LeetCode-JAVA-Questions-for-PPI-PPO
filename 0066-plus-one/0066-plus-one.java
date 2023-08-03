class Solution {
    public int[] plusOne(int[] digits) 
    {int i;
    int n=digits.length-1;
    int arr[]=new int[digits.length+1];
    for(i=digits.length-1;i>=0;i--) {
  if(digits[i]<9)
  {
      digits[i]=digits[i]+1;
      return digits;
  }
  else
  {
      digits[i]=0;
  }
  }
       arr[0]=1;
      for(int k=1;k<arr.length;k++){
      arr[k]=0;
     }
      return arr;
    }
}