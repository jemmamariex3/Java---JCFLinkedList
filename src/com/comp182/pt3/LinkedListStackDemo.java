package com.comp182.pt3;

/**
 * Created by JemmaMarie on 6/14/17.
 */
public class LinkedListStackDemo {
    public static void main(String [] args){
        GenericStack<Integer> stack = new LinkedListStack<Integer>();
            stack.push(4);
            stack.push(45);
            stack.push(34);
            stack.push(134);
            stack.push(434);
            stack.push(1634);

            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }

    }
}
