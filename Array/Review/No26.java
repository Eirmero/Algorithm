package com.Array.review;

public class No26 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int formerIndex = 1, latterIndex = 0, count = nums.length;
        if (nums.length < 2) {
            return nums.length;
        }
        for(;formerIndex<nums.length;formerIndex++){
            if(nums[formerIndex] != nums[latterIndex]){
                nums[++latterIndex] = nums[formerIndex];
            }else{
                count--;
            }
        }
        return count;
    }
}

//用双指针来解决 遇到重复的就指针后移 重复继续 只需要返回唯一元素的个数
//分析得知难点在于控制循环 后移指针中如何包换交换数组
//选择了在循环中加入一个自动置换 如果没有后移指针则看起来没有变化 后移指针则自动修改数组

//你无敌了孩子 这都给你一次写出来了^^||
