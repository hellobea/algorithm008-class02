/***
70. 爬楼梯
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
***/


// 动态规划
// class Solution {
//     public int climbStairs(int n) {
//         if( n == 1 ) return 1;
//         int[] stairs = new int[n+1];
//         stairs[1] = 1;
//         stairs[2] = 2;
//         for( int i = 3; i <= n; i++ ){
//             stairs[i] = stairs[i-1] + stairs[i-2]; //这种也可以使用迭代 斐波那契
//         }
//         return stairs[n];
//     }
// }

//傻递归
// public class Solution{
//     public int climbStairs(int n){
//         climb_Stairs( 0, n )；
//     }
//     public int climb_Stairs( int i, int n ){
//         if( i > n )
//             return 0;
//         if( i == n )
//             return 1;
//         return climb_Stairs( i+1, n ) + climb_Stairs( i+2, n );
//     }
// }

//递归 先drill down 然后再回溯 要好好看看！
public class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }
    public int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }
}







