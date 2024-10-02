package com.Array.elementRemove;

public class No977 {
    public static void main(String[] args) {

    }
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int left = 0, right = size - 1;
        int[] result = new int[size];
        int index = size -1;
        while (left <= right) {
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                result[index] = nums[left]*nums[left];
                left++;
                index--;
            }else {
                result[index] = nums[right]*nums[right];
                right--;
                index--;
            }
        }
        return result;
    }

}
