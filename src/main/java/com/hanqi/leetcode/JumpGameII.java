package com.hanqi.leetcode;

public class JumpGameII {
    public int jump(int[] nums) {
        int length = nums.length;
        int max = 0;
        int end = 0;
        int ans = 0;
        for (int i = 0; i < length - 1; i ++) {
            max = Math.max(max, i + nums[i]);
            if (i == end) {
                end = max;
                ans++;
            }
        }
        return ans;
    }
}
