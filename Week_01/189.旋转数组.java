/************************************************************
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

示例 1:

输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]
示例 2:

输入: [-1,-100,3,99] 和 k = 2
输出: [3,99,-1,-100]
解释: 
向右旋转 1 步: [99,-1,-100,3]
向右旋转 2 步: [3,99,-1,-100]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/rotate-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
************************************************************/

// //法一：暴力直接循环移动
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int temp,move;
//         for( int i = 0; i < k; i++ ){
//             move = nums[nums.length - 1];
//             for( int j = 0 ; j < nums.length ; j++ ){
//                 temp = nums[j];
//                 nums[j] = move;
//                 move  = temp;
//             }
//         }
//     }
// }

// // //法二：和循环链表结构很像 用 % 计算很方便（《大话数据结构》）
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int[] a = new int[nums.length];
//         for( int i = 0 ; i < nums.length ; i++ ){
//             a[( i + k ) % nums.length] = nums[i];
//         }
//         for( int i = 0 ; i < nums.length ; i++ ){
//             nums[i] = a[i];
//         }
//     }
// }

// //法三：length % k = n  后n个元素之间放在数组最前方 剩下反序 (需要仔细看看)
public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for ( int start = 0; count < nums.length; start++ ) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}


