package com.HashTable;

import java.util.*;

public class No483 {
    public static void main(String[] args) {}
    public List<Integer> findAnagrams(String s, String p) {
        int[] record = new int[26];

        for (int i = 0; i < p.length(); i++) {
            record[p.charAt(i) - 'a']++;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0, j = p.length() - 1; i <= s.length() - p.length(); i++, j++) {
            int[] res = record.clone();
            for(int k = i; k <= j; k++) {
                res[s.charAt(k) - 'a']--;
            }
            int tag = 0;
            for(int re : res) {
                if(re != 0) {
                    tag = 1;
                    break;
                }
            }
            if(tag == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}

//拿到的第一反应：滑动窗口框出来每一个都比较就行 先把p送进hashSet 然后和滑出来的新set对比 用数组替代set即可
//你无敌了孩子 写的乱飞了还给你用数组跑出来了^^|| 回头看看正确解法


