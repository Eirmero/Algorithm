public class No34 {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        if (leftBorder == -2 || rightBorder == -2) {
            return new int[]{-1, -1};
        }
        if (rightBorder - leftBorder > 1) {
            return new int[]{leftBorder + 1, rightBorder - 1};
        }
        return new int[]{-1,-1};
    }

    int getRightBorder(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int rightBorder = -2; //为什么会设置-2而不是-1呢？ 理解是在输出的时候如果有问题可以直接察觉到原因 这种思想后续也要学会使用
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
                rightBorder = left;
            }
        }
        return rightBorder;
    }

    int getLeftBorder(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int leftBorder = -2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                leftBorder = right;
            }
            else {
                left = mid + 1;
            }
        }
        return leftBorder;
    }
}

//拿到这道题看条件 排序数组 有重复值 要求返回指定元素出现的第一个位置和最后一个位置
//返回值就是数组
//老二分人了 三步 首尾判断 循环体 边界设置
//middle的原因就在有重复 这里研究如果有重复怎么写

//这里分别寻找leftBorder和rightBorder 是对二分法的高级使用方法
//在传统二分法中 如果只查一个数的情况 =则返回 !=则根据情况设置新的left和right
//在此处 需要通过修改条件分别寻找左右边界
//理解分开寻找的“边界”的内在含义

//通过加深理解 可以发现使用left + ((right - left) >> 1)获得的mid最大为right-1 不会越界 当然最小就是left

//分三种情况 1.target在数组外 2.target不存在 3.target存在

//太复杂 用方法2
//直接二分查 然后搜索边界判断就行 时间复杂度为O(n)而不是O(logn)

//使用这种算法可以将时间复杂度限制在O(logn)
//Using this algorithm, the time complexity can be limited to O(logn)