package com.Array.elementRemove;

public class No26 {
    public static void main(String[] args) {

    }
    //法1
//    public int removeDuplicates(int[] nums) {
//        int size =  nums.length;
//        for (int i = 0; i < size - 1; i++) {
//            if(nums[i] == nums[i+1]){
//                for(int j = i; j < size - 1; j++){
//                    nums[j] = nums[j+1];
//                }
//                i--;
//                size--;
//            }
//        }
//        return size;
//    }
    //法2
    public int removeDuplicates(int[] nums) {
        int formerPointer = 0, size = nums.length;
        for (int latterPointer = 0; latterPointer < nums.length-1; latterPointer++) {
            if (nums[latterPointer] == nums[latterPointer + 1]) {
                size--;
            }else{
                nums[formerPointer+1] = nums[latterPointer+1];
                formerPointer++;
            }
        }
        return size;

    }
}

//非严格递增：允许相邻的元素相等，因此只要保证不减少即可 Non-strictly increasing
//严格递增：相邻的元素不能相等，必须严格增加
//数组元素删除问题 要不暴力循环 要不双指针

//这里还是给出两种方法 一个是暴力循环 一个是连续指针
//前指针former pointer 后指针latter pointer












