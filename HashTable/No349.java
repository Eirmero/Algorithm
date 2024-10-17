package com.HashTable;

import java.util.HashSet;
import java.util.Set;

public class No349 {
    public static void main(String[] args) {}
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new int[0];

        Set<Integer> set = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();

        for(int i : nums1) {
            set.add(i);
        }

        for(int i : nums2) {
            if(set.contains(i)) {
                resSet.add(i);
            }
        }

        return resSet.stream().mapToInt(x -> x).toArray();
    }
}

//返回这句话很抽象
//使用这句话需要弄明白Set和返回需要的数组之间有什么区别 需要怎么转换

//1.本题求交集 但对于重复元素只用使用一次
//后续回来写出现重复情况的例子 这时就要用hashmap而不是set了


