package com.mecanzhou.base;

/**
 * Created by zhoumaogen on 2021-03-31 21:45
 *
 * @Description
 */
public class EORSwap {

    public EORSwap() {
        int a = 1;
        int b = 2;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        new EORSwap();
    }

}
