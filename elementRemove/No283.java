package com.Array.elementRemove;

import java.util.Arrays;

public class No283 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int leftPointer = 0;
        for(int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            if(nums[rightPointer] != 0) {
                nums[leftPointer] = nums[rightPointer];
                leftPointer++;
            }
        }
        for(int i = leftPointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
