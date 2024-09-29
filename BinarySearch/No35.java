public class No35 {
    public static void main(String[] args) {

    }

//    public int searchInsert(int[] nums, int target) {
//        if(target < nums[0] || target == nums[0]){
//            return 0;
//        }
//
//        if(target > nums[nums.length-1]){
//            return nums.length;
//        }
//        if(target == nums[nums.length-1]){
//            return nums.length-1;
//        }
//
//
//        int left = 0, right = nums.length-1;
//        while(left <= right){
//            int mid = left + ((right - left)>>2);
//            if(nums[mid] == target){
//                return mid;
//            }
//            if(nums[mid] < target && nums[mid+1] > target ) {
//                return mid + 1;
//            }
//            if(nums[mid] < target){
//                left = mid + 1;
//            }
//            if(nums[mid] > target && nums[mid-1] < target){
//                return mid;
//            }
//            if(nums[mid] > target){
//                right = mid - 1;
//            }
//        }
//    return -1;
        public int searchInsert(int[] nums, int target) {
            if(target < nums[0] || target == nums[0]){
                return 0;
            }

            if(target > nums[nums.length-1]){
                return nums.length;
            }

            int left = 0, right = nums.length-1, mid = 0;
            while(left <= right){
                mid = left + ((right - left)>>2);
                if(nums[mid] == target){
                    return mid;
                }
                if(nums[mid] < target){
                    left = mid + 1;
                }
                if(nums[mid] > target){
                    right = mid - 1;
                }
                else {
                    return right + 1;
                }

            }

            return right +1;
//算法改进了 但是消耗内存上去了 但肯定得这么写

    }
}

//拿到这道题 第一看条件 满足排序数组和无重复元素 因此使用二分查找 满足条件的O(log n)时间复杂度
//二分查找包括：首末target比较 二分比较 返回结果三部分

//对于这个题 还要考虑返回值之间的比较 所以在开头比较中多加了一个if 在内部多加了些判断方法

//看看gpt的优化给出的建议:
//1.优化首位判断当前代码中有多个 target == nums[0] 和 target == nums[nums.length-1] 的比较
// 这些可以被合并到二分查找逻辑中，从而减少代码冗余
//2.循环体中的if存在越界情况 因此要更小心的处理
//3.简化代码逻辑，对于二分查找，核心逻辑应该是通过不断调整左右指针，
// 直到找到目标位置，而不需要手动判断边界处的特殊情况

/*

public int searchInsert(int[] nums, int target) {
    // 如果目标值小于等于首元素，返回0
    if (target <= nums[0]) {
        return 0;
    }

    // 如果目标值大于尾元素，返回数组长度
    if (target > nums[nums.length - 1]) {
        return nums.length;
    }

    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + ((right - left) >> 2);

        // 找到目标值
        if (nums[mid] == target) {
            return mid;
        }

        // 根据目标值与中间值的比较，调整左右指针
        if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    // 最终，`left` 指针将会是插入目标值的正确位置
    return left;
}

 */

// Upon receiving this problem, the first step is to check the conditions.
// The array is sorted and contains no duplicate elements,
// which allows us to use binary search to achieve the required O(log n) time complexity.
//"O(log n)" is read as "O of log n" or "Big O of log n".
