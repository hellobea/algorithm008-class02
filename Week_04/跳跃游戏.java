
public class P55跳跃游戏 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int[] nums2 = {3,2,1,0,4};
        System.out.println(new Solution().canJump(nums));
        System.out.println(new Solution().canJump(nums2));
    }
    static class Solution {
        public boolean canJump(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (max >= nums.length) return true; // 如果已超过最大距离, 不用继续遍历
                if (i > max) return false; // 如果出现 i > max, 说明终点不可达
                max = Math.max(max, i+nums[i]);
            }
            return true;
        }
    }
}