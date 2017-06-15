package com.comp182.pt2;

/**
 * Created by JemmaMarie on 6/14/17.
 */
public class MyClass <E> {
    private E theData;
    private int n;

    public MyClass(){
        n = 0;
    } // end constructor

    public MyClass (E initData, int num){
        n = num;
        theData = initData;
    }// end constructor

    public void setData(E newData){
        theData = newData;
    } //end set Data

    public E getData(){
        return theData;
    }

    public int getNum(){
        return n;
    } //end getNum
}// end MyClass
