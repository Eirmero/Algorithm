package com.Array.SpiralMatrix;

public class No59 {
    public static void main(String[] args) {

    }
    public int[][] generateMatrix(int n) {
        int startX = 0, startY = 0;
        int loop = 1;
        int[][] matrix = new int[n][n];
        int count = 1;

        while(loop <= n / 2){
            //顺时针 从上边开始
            //上边
            for(int i = startX; i < n - loop; i++ ){
                matrix[startX][i] = count++;
            }

            //右边
            for(int j = startY; j < n - loop; j++ ){
                matrix[j][n - loop] = count++;
            }

            //下边
            for(int k = n - loop; k >= loop  ; k-- ){
                matrix[n - loop][k] = count++;
            }

            //左边
            for(int h = n - loop; h >= loop ; h-- ){
                matrix[h][startY] = count++;
            }
            startX++;
            startY++;
            loop++;

            //如果n是奇数

        }

        if(n%2 == 1){
            matrix[n/2][n/2] = count;
        }

        return matrix;
    }
}

//针对循环矩阵
//每一圈有四条边 使用左闭右开的区间来填写可以有效防止边界问题
//最终还是把borderCount删了直接用loop 再解决新问题的时候其实没必要 不过写熟练了确实无所谓
//循环矩阵 终究是弄清楚要循环多少次 边界为n 当n不为1的时候循环肯定是n/2次 当n为1单独拉出来就行
//在循环n/2次的基础上 每次循环四边分开写循环 边界设置清楚
//在数组中 长度为n 下标最大为n-1