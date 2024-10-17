package com.HashTable;

import java.util.HashMap;
import java.util.Map;

public class No1 {
    public static void main(String[] args) {}
    public int[] twoSum(int[] nums, int target) {
       int[]  res = new int[2];
       if(nums.length == 0 || nums == null){
           return res;
       }

        Map<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length ; i++){
           int temp = target - nums[i];
           if(map.containsKey(temp)){
               res[0] = map.get(temp);
               res[1] = i;
               break;
           }
           map.put(nums[i], i);
       }
       return res;
    }
}

//当出现 元素是否出现 出现次数的时候 会使用哈希表
//最简单的办法肯定就是暴力训练O(n^2) 回头复习的时候顺便写写

