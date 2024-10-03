package com.Array.binarySearch;

public class No367 {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1){
            return true;
        }

        int left = 0, right = num-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;


    }
}

//给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
//平方 转化成二分查找问题
//真溢出了 这得多大 以后要注意乘法条件必须加(long)