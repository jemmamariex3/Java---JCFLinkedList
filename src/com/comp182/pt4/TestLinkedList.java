package com.comp182.pt4;
import java.util.LinkedList;
import java.util.Iterator;

/**
 * Created by JemmaMarie on 6/15/17.
 */
public class TestLinkedList {
    static public void main (String [] args){
        LinkedList<Integer> myList = new LinkedList<Integer>();

        Iterator iter = myList.iterator();
        if(!iter.hasNext()){
            System.out.println("The list is empty");
        }
        for(int i = 1; i <= 5; i++){
            myList.add(new Integer(i));
        }
            iter = myList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
