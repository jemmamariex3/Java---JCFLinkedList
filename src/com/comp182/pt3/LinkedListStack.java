package com.comp182.pt3;

import java.util.EmptyStackException;

/**
 * Created by JemmaMarie on 6/14/17.
 */
public class LinkedListStack<E> implements GenericStack<E> {
    public LinkedListStack(){
        top = null;
    }
    private static class Element<E> {
        private E data;
        private Element<E> next;
        Element(E data, Element<E> next){
            this.data = data;
            this.next = next;
        }
    }
    private Element <E> top;
    @Override
    public void push(E v){
        if(v == null){
            throw new NullPointerException();
        }
        top = new Element<E>(v, top);

    }
    @Override
    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object data = top.data;
        top = top.next;
        return data;
    }
    @Override
    public Object peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object data = top.data;
        top = top.next;
        return data;
    }
    public boolean isEmpty(){
        return(top == null);
    }
}
