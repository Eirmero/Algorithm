package com.Array.review;

public class No34 {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] output = new int[2];
        if(nums.length == 0){
            output[0] = -1;
            output[1] = -1;
        }else {
            output[0] = findLeftBound(nums, target);
            output[1] = findRightBound(nums, target);
        }

        return output;
    }

    public int findLeftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                if(mid == 0 || nums[mid - 1] != target){
                    return mid;
                }
                right = mid - 1;//继续往左找
            }
        }
        return -1;

    }

    public int findRightBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                if( mid == nums.length - 1|| nums[mid + 1] != target){
                    return mid;
                }
                left = mid + 1;
            }
        }
        return -1;

    }
}

//关键词： 非递减数组 找出目标值开始和结束位置

//如果不存在返回[-1, -1]

//要求O(logn) 一眼二分查找
//查找到附近 进行边界寻找
//关键点 由于要返回第一次出现和最后一次出现的序列 所以需要搜索两次
//这两次各有什么特点呢 左边界的左侧永远比target小 右边界永远大于等于target
//右边界的右侧永远比target大 左侧永远小于等于target

//报错情况 java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length
//看第一行 at line 28, Solution.findLeftBound
//报错原因 在或判断|| 中 先判断是否越界 再访问可能越界的情况

//The keyword of this question is a non-decreasing array and find the start and end position of the target
//if the target is not existed, then return [-1, -1] (negative one)
//And it requests a time complexity of O(logn) (big O of log n || order of log n)
//which means it should use a binary search
//while it needs to return the start and end index of the target
//but once binary search could only find one target
//So two binary search will be used to find both left boundary and right boundary

//So what is the feature of the left and right boundary?
//For the left boundary, the value in the left of the boundary is always smaller than the boundary
//the opposite is also true || Conversely, the value in the right of the boundary is always larger than the boundary
//So here designed two algorithm for the boundary search