package com.mecanzhou.base;

/**
 * Created by zhoumaogen on 2021-03-31 21:31
 *
 * @Description
 */
public class BitCalculate {
    public static void main(String[] args) {
        int a = 10 >> 1;
        int b = a++;
        int c = ++a;
        int d = b * a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
