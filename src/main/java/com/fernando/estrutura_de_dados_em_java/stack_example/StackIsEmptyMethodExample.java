package com.fernando.estrutura_de_dados_em_java.stack_example;

import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;

public class StackIsEmptyMethodExample {
    public static void main(String[] args) {
        Stack<Integer> numbers = new DynamicStack<>();

        System.out.print(numbers.isEmpty());

        // true
    }
}
