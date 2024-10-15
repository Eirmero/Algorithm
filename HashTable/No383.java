package com.HashTable;

public class No383 {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            record[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            record[ransomNote.charAt(i) - 'a']--;
        }
        for (int rec : record) {
            if (rec < 0) {
                return false;
            }
        }
        return true;
    }
}

//看到这道题第一反应就是统计字母出现频率 然后再做判断 用HashMap肯定是效率最快的 但似乎也可以用数组
//确实是直接使用数组 并反复进行记录 直接上手~
//很顺利~