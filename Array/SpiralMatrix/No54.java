package com.Array.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class No54 {
    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        while (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;

        while (left <= right && top <= bottom) {
            //顺时针上右下左 区间左开右闭
            //上边
            for (int i = left; i < right; i++) {
                list.add(matrix[top][i]);
            }

            //右边
            for (int j = top; j < bottom; j++) {
                list.add(matrix[j][right]);
            }

            //下边
            for (int k = right; k > left; k--) {
                list.add(matrix[bottom][k]);
            }

            //左边
            for (int h = bottom; h > top; h--) {
                list.add(matrix[h][left]);
            }

            //修改计数器
            left++;
            right--;
            top++;
            bottom--;
        }



        //n为奇数
        if(n%2 == 1){

        }

        return list;

    }

}

//接收矩阵传入数组了
//分析
//1.首先是要创建一个list 然后在每个循环中都push进数组
//2.接收这个matrix是一个二维数组 我需要知道他的边长
//tips:二维数组的长度方法matrix.length()返回的是列长 matrix[0].length()返回的是行长
//3.对边操作
//4.接口List和实现类ArrayList的操作
//arrayList.add()

//考虑不为正方形的情况 吗的 他真的不是标准矩形 无敌了孩子
//这题先放放 我了个去