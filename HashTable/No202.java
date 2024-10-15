package com.HashTable;

import java.util.HashSet;
import java.util.Set;

public class No202 {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = getNew(n);
        }
        return n == 1;
    }
    private int getNew(int n){
        int count = 0;
        int temp = 0;
        while(n > 0){
            temp = n%10;
            count += temp*temp;
            n /= 10;
        }
        return count;
    }
}

//第一部分求平方和 第二部分做判断
//这个return n == 1和HashSet的成员方法、如何求每一位的个数都要学习
