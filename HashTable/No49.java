package com.HashTable;

import java.util.*;

public class No49 {
    public static void main(String[] args) {}
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

//mid来咯
//第一想法是参考单个字母异位词 把每个词的每个字母都放入HashSet
//然后作比较 遇到完全一样的就放一块 不一样的就单独排

//gpt给出的解法是先将字符串按字符顺序进行排序 再直接放入hashMap 比较后返回
//学一下新方法的应用吧~
//map内元素操作
//map.get(key).add(value);
//map.put(key, new ArrayList());
//map.containsKey(n);
//Map<String, List<String>> map = new HashMap<>();
//char[] chars = str.toCharArray;
//Array.sort(chars);
//String key = new String(chars)

//还可以用字符计数器来写 在学完字符串后回来试着实现这个方法