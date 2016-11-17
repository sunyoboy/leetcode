package com.javase.test;

/**
 * Created by DD240 on 2016/10/12.
 */
public class Solution54 {
    public double myPow(double x, int n) {
        double value = 1.0d;
        boolean flag = false; // n是否为负数的标志
        if(n < 0) {
            flag = true;
            n = -n;
        }
        while(n-- > 0) {
            if(value * x > Math.pow(10, 23)) {
                break;
            }
            value = value * x;
        }

        if (flag) {
            value = 1 / value;
        }
        return value;



/*        while(n-- > 0) {
            rtn = rtn * x;
            if(rtn > Double.)
        }
        if (flag) {
            rtn = 1 / rtn;
        }
        return rtn;  */
    }

    public static void main(String[] args) {
        Solution54 solution54 = new Solution54();
/*        solution54.myPow(8.88023, 3);
        System.out.println(solution54.myPow(0.00001, 2147483647));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Math.pow(8.88023, 3));*/
        System.out.println(solution54.myPow(-3, 2));
        System.out.println(solution54.myPow(-3, -2));
        System.out.println(solution54.myPow(3, -2));
        System.out.println(solution54.myPow(3, 2));
/*        System.out.println(Math.pow(-3, 2));
        System.out.println(Math.pow(-3, -2));
        System.out.println(Math.pow(3, -2));
        System.out.println(Math.pow(3, 1));
        System.out.println(Math.pow(3, 2));*/

/*        9.0
        0.1111111111111111
        0.1111111111111111
        3.0
        9.0  */
    }
}