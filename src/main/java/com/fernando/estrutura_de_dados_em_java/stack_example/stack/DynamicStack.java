package com.fernando.estrutura_de_dados_em_java.stack_example.stack;

import java.util.ArrayList;
import java.util.List;

public class DynamicStack<T> implements Stack<T> {
    private Node<T> top;
    private Integer size = 0;

    @Override
    public T push(T element) {
        Node<T> node = new Node<>(element);

        Node<T> top = this.top;
        node.setPrev(top);

        this.top = node;
        size++;
        return node.getElement();
    }

    @Override
    public void update(T element) {
        this.top.setElement(element);
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isNotEmpty() {
        return size > 0;
    }

    @Override
    public T peek() {
        if (top == null) {
            return null;
        }
        return top.getElement();
    }

    @Override
    public T pop() {
        if (size == 0) return null;
        Node<T> currentTop = this.top;

        this.top = this.top.getPrev();
        size--;

        return currentTop.getElement();
    }

    @Override
    public void clear() {
        while(top != null) {
            pop();
        }
    }

    @Override
    public String toString() {
        List<T> list = new ArrayList<>();

        if (size == 0) {
            return list.toString();
        }

        Node<T> prevNode = this.top.getPrev();

        if (prevNode == null) {
            list.add(this.top.getElement());
            return list.toString();
        }

        Node<T> top = this.top;

        while (top.getPrev() != null) {
            T element = top.getElement();

            list.add(element);
            top = top.getPrev();
        }

        list.add(top.getElement());
        return list.reversed().toString();
    }
}