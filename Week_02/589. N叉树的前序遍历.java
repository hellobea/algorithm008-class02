/**
给定一个 N 叉树，返回其节点值的前序遍历。

例如，给定一个 3叉树 :

 



 

返回其前序遍历: [1,3,5,6,2,4]。

 
**/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
//递归
// class Solution {
//     List<Integer> res=new ArrayList<Integer>();
//     public List<Integer> preorder(Node root) {
//         helper(root);
//         return res;
//     }
//     public void helper(Node root){
//         if (root==null) return;
//         res.add(root.val);
//         for (int i = 0; i <root.children.size() ; i++) {
//             helper(root.children.get(i));
//         }
//     }
// }

//迭代
class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null)   return output;
        stack.add(root);//根先入栈
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();//根-左-右。根先出栈
            output.add(node.val);//根添加到结果集
            //后进先出，要逆序，才可以从左往右输出
            Collections.reverse(node.children);
            for (Node item : node.children) {
                stack.add(item);
            }
        }
        return output;
    }
}