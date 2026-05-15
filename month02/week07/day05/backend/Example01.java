
public class Example01 {
    // Problem
    // Өгөгдсөн тоо хүртэлх тоонуудын нийлбэрийг олно уу.

    // Solution
    // Recursion
    static int sumR(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumR(n - 1);
    }

    // Iteration
    static int sumI(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    // Математикийн формула — O(1)!
    static int sumF(int n) {
        return n * (n + 1) / 2;
    }

    // powerR рекурсив үржвэрийг нь олно уу 1-10 хүртэлх тооны үржвэрийг гаргах
    // 1*2*3
    static int powerI(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static int powerR(int n) {
        if (n == 1) {
            return 1;
        }
        return n * powerR(n - 1);
    }

    static int mystery(int n) {
        if (n == 1) {
            return 1;
        }
        return mystery(n / 2) + 1;
    }
    // mystery(8) =  mystery(4) + 1 = mystery(2) + 1 + 1 = mystery(1) + 1 + 1 + 1 = 1 + 1 + 1 + 1 = 4
    // mystery(16) = 5
    // mystery(32) = 6 
    // 2 ^ (n - 1) = 8 (n = 4)

    public static void main(String[] args) {
        System.out.println(sumR(100));// 5050
        System.out.println(sumI(100)); // 5050
        System.out.println(sumF(100)); // 5050

        System.out.println(powerI(3)); // 6
        System.out.println(powerR(3)); // 6
    }
}
