package com.atguigu.java;

public class ClinitTest {

    private int a = 5;
    private static int b = 3;

    static {
        b = 10;
    }

    public static void main(String[] args) {
        int c = 4;
        System.out.println("哈哈哈");
        System.out.println("哈哈哈 hot-fix");
        System.out.println("哈哈哈 master-test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        System.out.println("pull test");
        System.out.println("push test2");
        System.out.println("哈哈哈哈");
        System.out.println("哈哈哈哈");
        System.out.println("哈哈哈2");
    }
}
