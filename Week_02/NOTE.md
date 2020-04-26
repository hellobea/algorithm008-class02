学习笔记
堆和二叉堆、图

堆Heap：可以迅速找到最大值或者最小值（大顶堆/小顶堆）

假设时大顶堆,常见操作（API）：
find-max:O(1)
delete-max:O(logN)
insert(create):O(logN)orO(1)

二叉堆性质
通过完全二叉树来实现（不是二叉搜索树）
是一棵完全树
树中任意节点的值总是>=其子节点的值

二叉堆一般都通过“数组”来实现的
左孩子索引（2*i+1）右孩子（2*i+2）
索引为i的父结点索引是floor（（i-1）/2）

Insert插入操作 O(log N）  
1. 新元素一律先插入到堆的尾部
2. 依次向上调整整个堆的结构（一直到根即可）——HeapifyUp

Delete Max 删除堆顶操作 O（log N）
1. 将堆尾元素替换到顶部（即堆顶被替代删除掉）
2. 依次从根部向下调整整个堆的结构（一直到堆尾即可）——HeapifyDown 和较大的一个交换
二叉堆是堆的一种常见且简单的实现，但不是最优的


树、二叉树、二叉搜索树的实现和特性

前序（Pre-order）：根-左-右
中序（In-order）：左-根-右
后序（Post-order）：左-右-根

示例代码（递归）
def preorder(self,root)
if root:
    self.traverse_path.append(root.val)  
    self.preorder(root.left)
    self.preorder(root.right)

def inorder(self,root)
if root:
    self.inorder(root.left)
    self.traverse_path.append(root.val)  
    self.inorder(root.right)


def postorder(self,root)
if root:
    self.postorder(root.left)
    self.postorder(root.right)
    self.traverse_path.append(root.val)  


二叉搜索树
    又称二叉搜索排序树，左子树所有节点都小于根节点；右子树所有节点都大于根节点。
    *中序遍历二叉搜索树后结果为升序排列

