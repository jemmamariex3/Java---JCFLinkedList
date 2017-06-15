package com.comp182.pt5;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by JemmaMarie on 6/15/17.
 */
public class SomeList {
    static public void main(String [] args){
        //declared a linked list
        LinkedList<String> jemmasList = new LinkedList<String>();

        //added 5 string elements
        jemmasList.add("red");
        jemmasList.add("green");
        jemmasList.add("blue");
        jemmasList.add("indigo");
        jemmasList.add("violet");

        //display list
        System.out.println("There are these many colors of the rainbow: " + jemmasList.size());
        System.out.println("The colors of the rainbow are: ");
        Iterator iter = jemmasList.listIterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }

        //add first and last element
        System.out.println("\nLet's add more colors!");
        jemmasList.addFirst("pink");
        jemmasList.addLast("burgundy");

        //get, set, and show new element
        System.out.println("Get first color on my list: " +jemmasList.get(0));
        jemmasList.set(0,"magenta");
        System.out.println("New first color on my list: " +jemmasList.get(0));

        //removed first and last elements
        System.out.println("Removing first and last colors on the list");
        jemmasList.removeFirst();
        jemmasList.removeLast();

        //added new element
        System.out.println("Add new first color on list");
        jemmasList.addFirst("teal");

        System.out.println("Removing the 3rd color on the list");
        jemmasList.remove(2);

        //displaying final list
        System.out.println("Jemma's final color list: ");
        iter = jemmasList.listIterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
    }
}
