package com.HashTable;
import java.util.*;

public class No15 {
    public static void main(String[] args) {}
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]){continue;}
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}

//从两数之和来反推 觉得是套娃 三数和 转化成target - 两数和 再寻找两数和
//但感觉过于繁琐
//无语了 就是这么写的 写写得了^^||
//这题有说法的 复习再写一遍 先不交了
