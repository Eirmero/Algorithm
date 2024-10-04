数组是存放在连续内存空间上的相同类型数据的集合
An array is a collection of data of the same type stored in continuous memory space
数组下标都是从0开始的
Array indices always start from 0
数组内存空间的地址是连续的
The memory addresses of an array's elements are contiguous
因为数组在内存空间的地址是连续的，所以我们在删除或者增添元素的时候，就难免要移动其他元素的地址
Because the memory addresses of an array's elements are contiguous, when we
delete or add elements, it's inevitable that we need to move other elements' addresses.
数组的元素是不能删的，只能覆盖
The elements of an array cannot be deleted, they can only be overwritten
像Java是没有指针的，同时也不对程序员暴露其元素的地址，寻址操作完全交给虚拟机
Languages like Java do not have pointers and do not expose the addresses of elements to the programmer.
The addressing operations are entirely handled by the virtual machine.

OJ1: No.704 Binary Search
操作符移位：((right - left) >> 1)
它将一个数的二进制形式向右移动若干位数，右移一位相当于将该数除以2,两位相当于/4
这是一种高效的除法操作，常用于对整型变量进行快速的除法运算
向下取整 即 5 >> 1 结果是2

0 1 2 3 4 5 6 7
0 1 2 3 4 5 6
找5

二分查找的条件：
数组是有序数组，数组中没有重复元素

字符串问题 844 暂留 到时候同时实现两种方法

从二分查找和线性查找的区别对比开始引入
如何评价一个算法的好坏

因此引入了时间复杂度
一个算法的执行，随数据规模增大，而增大的时间成本 不依赖环境因素

大O表示法：
asymptotic upper bound
asymptotic lower bound

Time complexity
Space complexity

*数组*
1.二分查找
EZ 704 Binary Search
EZ 35 insert position search
*MID 34 在排序数组中查找元素的第一个和最后一个位置
Find the first and last position of an element in a sorted array

EZ 367
EZ 69 这两道都是算数平方根

2.移除元素
//数组的特点是无法单独删除 只能覆盖 所以很多时候可以用双for循环来暴力解决
EZ 27 elementRemove
EZ 26 Remove duplicates from a sorted array

EZ 209
EZ 283
*EZ 844 字符串 放到后面写
EZ 977 有序数组的平方

3.滑动区间
EZ 904
*MID 904 FruitIntoBasket 很巧妙
*HARD 76 最小覆盖子串 字符串 放到后面一块 这个hard用了两个hashmap 学完hashmap后回来再练 这里属于是初见了

4.螺旋矩阵
*MID 59 螺旋矩阵II middle好像也没那么难^^
*MID 54 螺旋矩阵 本家了属于是 我了个去 这是个真矩阵 从条件到边界处理完全不一样还要分长短 晕了 复习再lian

5.区间和 第一次写ACM格式
KCNO44
KCNO58

复习内容 每日一道往期题解法与经典题 优先是当时完全没思路/想不明白的题
在复习中记录思路的英语解说
复习顺序：
二分查找 MID34
算数平方 选第一道
移除元素 26
有序数组的平方 977
滑动区间 904 hashMap初见
螺旋矩阵 54 真·矩阵
区间和 58 当做补足

数组告一段落 明日开始链表~~

记于2024年10月4日
