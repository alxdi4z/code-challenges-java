package org.challenges;

import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {
    private static int jumpingOnClouds(List<Integer> c) {
        int length_ = c.size();
        int jumpsNeeded = 0;
        for (int i=0; i < length_; i++) {
            if (i + 2 < length_ && c.get(i + 2) == 0) {
                jumpsNeeded++;
                i++;
                continue;
            }
            if (i + 1 < length_) jumpsNeeded++;
        }

        return jumpsNeeded;
    }

    public static void main(String[] args) {
        // inputs
        System.out.println(jumpingOnClouds(Arrays.asList(0, 1, 0, 0, 0, 1, 0)));
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 0, 0, 1, 0)));
    }
}
