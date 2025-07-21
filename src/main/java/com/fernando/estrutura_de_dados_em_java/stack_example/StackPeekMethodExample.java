package com.fernando.estrutura_de_dados_em_java.stack_example;

import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;
import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;

public class StackPeekMethodExample {
    public static void main(String[] args) {
        Stack<Integer> numbers = new DynamicStack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        System.out.print(numbers.peek());

        // 3
    }
}
