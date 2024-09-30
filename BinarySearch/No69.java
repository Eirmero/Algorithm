public class No69 {
    public static void main(String[] args) {

    }

    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long)mid * mid == x) {
                return mid;
            }
            else if ((long)mid * mid < x) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return r;

    }
}

//这个题能用二分
//非负整数x
//在[0,x]中寻找一个数k 使得k^2 <= x 取其右区间

//确定区间边界：左区间的数都小于等于x 右区间都大于x

//高级二分 难点就在于左右区间的寻找
//想清楚了 就可以下一个阶段了
//在使用<=时 l最后总会取到L+1 此时计算的mid结果应为L+1 故r=mid < l=L-1后触发停止条件 最后取r=mid-1即可
