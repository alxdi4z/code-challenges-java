package org.challenges;

import java.util.Arrays;

public class SquaresOfASortedArray {
    private static int[] solution(int[] nums) {
        int length = nums.length;
        int i = 0, j = length-1;
        int[] result = new int[length];
        for (int n = j; n >= 0; n--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[n] = nums[i] * nums[i];
                i++;
            } else {
                result[n] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // inputs
        System.out.println(Arrays.toString(solution(new int[]{-4,-1,0,3,10})));
        System.out.println(Arrays.toString(solution(new int[]{-7,-3,2,3,11})));
    }
}