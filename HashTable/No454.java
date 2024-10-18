package com.HashTable;

import java.util.HashMap;
import java.util.Map;

public class No454 {
    public static void main(String[] args) {}
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int c : nums3) {
            for (int d : nums4) {
                int sum = -(c + d);
                count += map.getOrDefault(sum, 0);
            }
        }
        return count;
    }
}

//结果是返回多少个个数 计数器count 采用分组的方式
//nums1和nums2用Hashmap存进去 遍历nums3和nums4找到结果
