package com.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No350 {
    public static void main(String[] args) {}
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int i : nums2) {
            if(map.containsKey(i) && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}


//这才正常 应该是会出现重复元素
//再看看数组的解法 用数组作为计数器 单开新列表用来输出结果