package com.comp182.pt3;

/**
 * Created by JemmaMarie on 6/14/17.
 */
public interface GenericStack<E> {
    void push(E v);
    Object pop();
    Object peek();
    boolean isEmpty();
}
