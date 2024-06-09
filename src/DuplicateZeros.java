package org.challenges;

import java.util.Arrays;

public class DuplicateZeros {
    private static int[] duplicateZerosInPlace(int[] arr) {
        int zeros_amount = 0;
        int length_ = arr.length;

        for (Integer number : arr) {
            if (number == 0) zeros_amount++;
        }

        for (int i=length_-1; i >= 0; i--) {
            if (i + zeros_amount < length_) {
                arr[i + zeros_amount] = arr[i];
            }
            if (arr[i] == 0) {
                zeros_amount--;
                if (i + zeros_amount < length_) {
                    arr[i + zeros_amount] = 0;
                }
            }
        }

        return arr;
    }

    private static int[] duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        for (int i=0; i <= length_ - possibleDups; i++) {
            if (arr[i] == 0) {
                if (i == length_ - possibleDups) {
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length_ - possibleDups;
        for (int i=last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
                continue;
            }
            arr[i + possibleDups] = arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        // inputs
        System.out.println(Arrays.toString(duplicateZerosInPlace(new int[]{1,0,2,3,0,4,5,0})));
        System.out.println(Arrays.toString(duplicateZerosInPlace(new int[]{1,2,3})));
        System.out.println(Arrays.toString(duplicateZerosInPlace(new int[]{8,4,5,0,0,0,0,7})));
    }
}
