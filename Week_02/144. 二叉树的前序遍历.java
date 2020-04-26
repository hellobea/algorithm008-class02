/**
给定一个二叉树，返回它的 前序 遍历。

 示例:

输入: [1,null,2,3]  
   1
    \
     2
    /
   3 

输出: [1,2,3]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList(){};
        preorder(root,res);
        return res;
    }
    public void preorder( TreeNode root,List < Integer >  res ){
    if(root!=null){
        res.add(root.val);
        if(root.left != null){ 
            preorder(root.left,res);
        }
        if(root.right != null){
            preorder(root.right,res);
        }
    }
}
}