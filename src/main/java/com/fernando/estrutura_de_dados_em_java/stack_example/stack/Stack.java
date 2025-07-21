package com.fernando.estrutura_de_dados_em_java.stack_example.stack;


public interface Stack<T> {
    T peek();
    T push(T element);
    void update(T element);
    T pop();
    boolean isEmpty();
    boolean isNotEmpty();
    void clear();
    int length();
}