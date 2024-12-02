package com.mecanzhou.base;

/**
 * Created by zhoumaogen on 2021-03-31 21:02
 *
 * @Description
 */
public class DefaultValue {
    private int a;
    private Integer b;

    public DefaultValue() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        new DefaultValue();
    }
}
