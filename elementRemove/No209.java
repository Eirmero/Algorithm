public class No209 {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}


//一道middle题 值得学习的地方
//1.这个算法本身 给人一种一碗醋包一锅饺子的感觉
//这个框一定能框中最大的数字 然后把最大的情况做比较
//2. Integer.MAX_VALUE的用法 初始化一个最大值
