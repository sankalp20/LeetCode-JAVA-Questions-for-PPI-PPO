/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums, 0, nums.length - 1);
    }
        private TreeNode CreateBST(int nums[], int l, int r) {
        if (l > r) { // Base Condition or Recursion Stoping Condition
            return null;
        } 
         int mid = l + (r - l) / 2; // this is the formula to find mid value
        TreeNode root = new TreeNode(nums[mid]); // mid value or median
        root.left = CreateBST(nums, l, mid - 1); // assign the value for left of subtree that is l to mid -1 for given
                                                 // array
        root.right = CreateBST(nums, mid + 1, r); // assign the value for right go subtree that is mid+1 to r for given
                                                  // array
        return root;
    }   
}
