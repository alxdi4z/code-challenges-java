package org.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
// time complexity: O(n2) space complexity: O(1)
//    private static int[] twoSum(int[] nums, int target) {
//        int[] result;
//        int length_ = nums.length;
//        for (int i=0; i < length_; i++) {
//            for (int j=length_ - 1; j > i; j--) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

//  time complexity: O(n) space complexity: O(n)
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        // inputs
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }
}
