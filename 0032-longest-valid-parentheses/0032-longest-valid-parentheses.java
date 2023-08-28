class Solution {
    public int longestValidParentheses(String s) {
        int maxAns = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.empty()){
                    stack.push(i);
                }else{
                    maxAns = Math.max(maxAns, i-stack.peek());
                }
            }
        }
        return maxAns;
    }
}