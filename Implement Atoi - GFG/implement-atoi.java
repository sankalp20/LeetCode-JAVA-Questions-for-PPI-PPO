//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	int l = str.length();
	if(l==0) return 0;
    
    
    int sign = 1;
    int i =0;
    int res=0;
    
    boolean containChar = false;
    
    if(str.charAt(0)== '-'){
        sign = -1;
        i++;
    }
    
    for(; i<l; i++){
        if(str.charAt(i)>=48 && str.charAt(i)<=57){
            res = res*10 + str.charAt(i)-48;
        } else {
            containChar = true;
        }
    }
    
    return containChar ? -1 : res*sign;
}
}