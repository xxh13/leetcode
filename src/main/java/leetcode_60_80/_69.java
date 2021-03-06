package leetcode_60_80;

/**
 *
 * Created by john on 2017/3/13.
 */
public class _69 {

    public static void main(String[] args) {
        _69 demo = new _69();
        int x = Integer.parseInt(args[1]);
        System.out.println(demo.mySqrt(x));
    }
    /**
     * binary search
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        long low = 1, high = x;
        long mid = 0;

        while (low < high) {
            mid = (low + high) / 2;
            if (mid * mid > x) {
                high = mid - 1;
            }else if (mid * mid < x) {
                low = mid + 1;
            } else {
                return (int) mid;
            }
        }

        return (int) (low * low > x ? low - 1 : low);
    }
}
