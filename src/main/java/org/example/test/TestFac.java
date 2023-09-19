package org.example.test;

public class TestFac {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fac(n));
    }

    public static int fac(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fac(n-1);
    }
}
