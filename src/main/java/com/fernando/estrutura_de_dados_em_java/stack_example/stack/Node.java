package com.fernando.estrutura_de_dados_em_java.stack_example.stack;

class Node<T> {
    private T element;
    private Node<T> prev;


    public Node(T element) {
        this.element = element;
        this.prev = null;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", prev=" + prev +
                '}';
    }
}