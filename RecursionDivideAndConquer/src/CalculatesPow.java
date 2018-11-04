public class CalculatesPow {
    /**
     * pow
     * 指数计算函数，递归解法
     *
     * @param x
     * @param n
     * @return
     */
    public static double powByRecursion(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
//        if(n == Integer.MIN_VALUE) return powByRecursion(x,n+1)/x;
        if (n < 0) return 1 / x * powByRecursion(1 / x, -(n + 1));
        if (n % 2 == 1) return x * powByRecursion(x, n - 1);
        return powByRecursion(x * x, n / 2);
    }

    /**
     * pow
     * 指数计算函数，while循环解法
     *
     * @param x
     * @param n
     * @return
     */
    public static double powByWhile(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        double result = 1;
        if (n == Integer.MIN_VALUE) {
            result /= x;
            n += 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double temp = x;
        while (n > 1) {
            if (n % 2 == 1) {
                result *= temp;
                n -= 1;
                continue;
            }
            temp *= temp;
            n /= 2;
        }
        return result * temp;
    }
}
