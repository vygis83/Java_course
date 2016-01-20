package com.example.series;

/**
 * Created by luksyvyg on 20/01/2016.
 */
public class Series {

    public Series() {
    }

    public static int nSum(int n) {
        int result = 0;
        for (int i=0; i<=n; i++) {
            result += i;
        }
        return result;
    }

    public static int factorial(int n) {
        int result = 1;
        if (n == 0) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static int fibonacci(int n) {
        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1 || n == 2) {
            result = 1;
        } else {
            int x1 = 1;
            int x2 = 1;
            int x3 = 0;
            for (int i=3; i<=n; i++) {
                x3 = x1 + x2;
                x1 = x2;
                x2 = x3;
            }
            result = x3;
        }
        return result;
    }
}
