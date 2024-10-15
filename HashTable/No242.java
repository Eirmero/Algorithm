package com.HashTable;

public class No242 {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }
        for(int rec : record){
            if(rec!=0){
                return false;
            }
        }
        return true;

    }
}

//在处理字符串细节中 学会charAt(i)的用法 对增强for循环有新理解 理解数组作为哈希结构的使用方法
