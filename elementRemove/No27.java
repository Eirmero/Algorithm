package com.Array.elementRemove;

public class No27 {
    public static void main(String[] args) {

    }
//    暴力算法 使用双循环 一个循环查找 一个循环修改数组并进行条件记录
//    public int removeElement(int[] nums, int val) {
//        int size = nums.length;
//        for(int i=0;i< size ;i++){
//            if(nums[i] == val){
//                for(int j=i+1;j < size;j++){
//                    nums[j-1]=nums[j];
//                }
//                i--;
//                size--;
//            }
//        }
//        return size;
//    }
//    这个算法的有点在于不费脑子(雾) 时间复杂度O(n^2)

    //方法2 双指针法 在一个while循环里完成两个指针的移动与数组内容置换
    //时间复杂度O(n) 空间复杂度O(1) 比暴力算法优秀
//    public int removeElement(int[] nums, int val) {
//        int slowIndex = 0;
//        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
//            if (nums[fastIndex] != val) {
//                nums[slowIndex++] = nums[fastIndex];
//            }
//        }
//        return slowIndex;
//
//    }

    //双向指针法 这个方法似乎更优秀 但是有两个循环



}
