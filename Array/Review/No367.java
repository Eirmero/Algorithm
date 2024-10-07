package com.Array.review;

public class No367 {
    public static void main(String[] args) {}
    public boolean isPerfectSquare(int num) {
        int left =0, right = num;
        while(left <= right){
            int mid = left + (right - left)/2;
            long square = (long) mid * mid;

            if(square==num){
                return true;
            }
            if(square>num){
                right = mid-1;
            }
            else if(square<num){
                left = mid+1;
            }
        }
        return false;
    }
}

//有效的完全平方数
//valid perfect square

//这个题的关键是用二分查找找到最接近他平方的那个数(范围是0到他自己左开右闭 0单独讨论)
//写完发现不用讨论0 但是超时了
//正好吸取一下经验 超时怎么解决：
//妈的还在找移出那个题 这就是溢出那个题
//int类型的大小是2^31-1 而给出的nums范围就是这个 所以必定会超出
//所以需要(long)一下 类型转换之后就不会溢出了
//同时 你可以发现这个mid*mid不需要一个循环计算三次 这才是超时的根本原因
//击败百分百~