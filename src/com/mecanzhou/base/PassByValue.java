package com.mecanzhou.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoumaogen on 2021-03-31 20:53
 *
 * @Description
 */
public class PassByValue {
    public PassByValue() {
//        String a = "123";
//        change(a);
//        System.out.println(a);
        List<String> a = new ArrayList<>();
        a.add("123");
        a.add("456");
        changeList(a);
        System.out.println(a.get(1));
    }

    public static void main(String[] args) {
        new PassByValue();
    }

    private void change(String str) {
        str = "abc";
    }

    private void changeList(List<String> list) {
        list.set(1, "abc");
    }
}
