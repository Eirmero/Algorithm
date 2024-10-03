package com.Array.binarySearch;

public class No704 {
    public int search(int[] nums, int target) {
        // 检查目标值是否在数组范围内
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;  // 这里要用索引，而不是元素值
        while (left <= right) {
            int mid = left + ((right - left) >> 1);  // 计算中点，防止溢出

            if (nums[mid] == target) {
                return mid;  // 找到目标值，返回索引
            }

            if (nums[mid] < target) {
                left = mid + 1;  // 目标值在右侧
            } else {
                right = mid - 1;  // 目标值在左侧
            }
        }
        return left;
    }
}


//public int search(int[] nums, int target) {
//    if(target < nums[0] || target > nums[nums.length - 1]){
//        return -1;
//    }
//
//    int left = 0;
//    int right = nums[nums.length - 1];
//    while(left <= right){
//        int mid = ((right - left)  >> 1  );
//        if(nums[mid] == target){
//            return mid;
//        }
//        if(target > nums[mid]){
//            right += mid;
//        }
//        if(nums[mid] > target){
//            right = mid;
//        }
//        return -1;
//    }
//
//}