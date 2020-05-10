/**
105. 从前序与中序遍历序列构造二叉树
根据一棵树的前序遍历与中序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7
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
  int pre_idx = 0;
  int[] preorder;
  int[] inorder;
  HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

 public TreeNode buildTree(int[] preorder, int[] inorder) {
    this.preorder = preorder;
    this.inorder = inorder;
    //根-左-右 
    //左-根-右
    int idx = 0;
    //存储每个值在中序遍历中的index
    for (Integer val : inorder)
      idx_map.put(val, idx++);
    return helper(0, inorder.length);
  }

  public TreeNode helper(int in_left, int in_right) {
    if (in_left == in_right)
      return null;
    //先序遍历第一个肯定为根
    int root_val = preorder[pre_idx];
    TreeNode root = new TreeNode(root_val);
    //获取根在中序遍历中的位置
    int index = idx_map.get(root_val);
    
    pre_idx++;
    // 左子树 0 到 index
    root.left = helper(in_left, index);
    // 右子树 index+1 到 length
    root.right = helper(index + 1, in_right);
    return root;
  }
}