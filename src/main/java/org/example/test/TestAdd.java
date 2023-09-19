package org.example.test;

public class TestAdd {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println(add(n1, n2));
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
