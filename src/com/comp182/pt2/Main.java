package com.comp182.pt2;

/**
 * Created by JemmaMarie on 6/14/17.
 */
public class Main{
    static public void main(String [] args) {
        MyClass<String> a = new MyClass<String>();
        Double d = new Double(6.4);
        MyClass<Double> b = new MyClass <Double>(d, 51);

        a.setData("Sarah");
        System.out.println(a.getData() + ", "+b.getData());
        System.out.println(a.getNum() +", "+b.getNum());
    }
}

