package com.Array.PrefixSum;

import java.util.Scanner;

public class KCNo58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] prefixSum = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
            prefixSum[i] = sum;
        }

        while (scanner.hasNext()) {
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            int ssum;
            if (j==0){
                ssum = prefixSum[j];
            }else{
                ssum = prefixSum[k] - prefixSum[j-1];
            }
            System.out.println(ssum);
        }

        scanner.close();
    }
}

//第一反应是数组存取 然后for循环累加
//节约时间 使用前缀和 就是在每次输入数组后 同时用新数组获取前缀和
//似乎空间复杂度增加了 看看gpt如何点评
//gpt表示只要是线性数组 不管一个两个 O(2n)最终也是O(n)

//ACM写法确实不一样 直接在psvm里面写

