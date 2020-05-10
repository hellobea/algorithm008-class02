/**
50. Pow(x, n)
实现 pow(x, n) ，即计算 x 的 n 次幂函数。

示例 1:

输入: 2.00000, 10
输出: 1024.00000
示例 2:

输入: 2.10000, 3
输出: 9.26100
示例 3:

输入: 2.00000, -2
输出: 0.25000
解释: 2-2 = 1/22 = 1/4 = 0.25
说明:

-100.0 < x < 100.0
n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
**/

  //对x 和 n 的值进行特殊处理
        //最小值：Integer.MIN_VALUE= -2147483648 （-2的31次方）
        //最大值：Integer.MAX_VALUE= 2147483647  （2的31次方-1）
        //这里需要使用long类型，因为如果传入的n = -2147483648； 那么转成正数就丢失，所以要使用long
        long N = n;
        if(N < 0){
            N = -N;
            x = 1/x;
        }
        return  pow(x,N);

// //暴力 超出时间限制
// class Solution {
//     public double myPow(double x, int n) {
//         if( n < 0 ) return 1/myPow( x , -n );
//         if( n == 0 ) return 1;
//         double temp = 1;
//         for( int i = 1; i <= n ; i++ )
//             temp =  temp * x;
//         return temp;
//     }
// }

// 回溯
class Solution {
    public double myPow(double x, int n) {
        if ( n < 0 ) {
            x = 1 / x;
            n = -n;
        }
        return subPow(x, n);
    }
        private double subPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double half = subPow(x, n / 2);// 5/2 =2
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
};




