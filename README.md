# Estrutura de dados em Java

As implemetações das estruturas de dados em Java

- [Stack (Pilha)](#Pilha)
- Fila
- Linked List (Lista encadeada)
- Three (Árvore)
- Binary Three (Árvore binária)

## Pilha
```java
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
```
- ### Push() - Adiciona um elemento no topo da pilha.
  ```java
    import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
    import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;
    
    public class StackPushMethodExample {
        public static void main(String[] args) {
            Stack<Integer> numbers = new DynamicStack<>();
            
            numbers.push(1);
            numbers.push(2);
            numbers.push(3);
            
            System.out.print(numbers);
            
            // [1, 2, 3]
        }
    }
  ```
  
- ### Pop() - Remove o elemento que está no topo da pilha e atualiza o topo da pilha.
  ```java
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;
  
  public class StackPopMethodExample {
      public static void main(String[] args) {
          Stack<Integer> numbers = new DynamicStack<>();
          numbers.push(1);
          numbers.push(2);
          numbers.push(3);

          System.out.println(numbers.pop());

          System.out.print(numbers);

          // 3
          // [1, 2]
      }
  }
  ```
- ### Peek() - Retorna o elemento que está no topo da pilha sem remove-lo.
  ```java
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;   import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
    
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
  ```
- ### isEmpty() - Verifica se a pilha está vazia.
  ```java
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
  
  public class StackIsEmptyMethodExample {
      public static void main(String[] args){
          Stack<Integer> numbers = new DynamicStack<>();

          System.out.print(numbers.isEmpty());

          // true
      }
  }
  ```
- ### isNotEmpty() - Verifica se a pilha não está vazia.
  ```java
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;   
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
  
  public class StackIsNotEmptyMethodExample {
      public static void main(String[] args){
          Stack<Integer> numbers = new DynamicStack<>();
          numbers.push(1);
          numbers.push(2);
          numbers.push(3);

          System.out.print("isNotEmpty: " + numbers.isNotEmpty());

          // isNotEmpty: true
      }
  }
  ```
- ### length() - Retorna o tamanho da pilha.
  ```java
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;
  
  public class StackLengthMethodExample {
      public static void main(String[] args){
          Stack<Integer> numbers = new DynamicStack<>();
          numbers.push(1);
          numbers.push(2);
          numbers.push(3);

          System.out.print(numbers.length());

          // 3
      }
  }
  ```

- ### clear() - Remove todos os elementos da pilha.
  ```java
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;   
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
  
  public class StackClearMethodExample {
      public static void main(String[] args){
          Stack<Integer> numbers = new DynamicStack<>();
          numbers.push(1);
          numbers.push(2);
          numbers.push(3);

          numbers.clear();

          System.out.println("IsEmpty: " + numbers.isEmpty());
          System.out.print("Length: " + numbers.length());

          // IsEmpty: true
          // Length: 0
      }
  }
  ```
  
- ### update() - Atualiza o elemento que está no topo da pilha.
  ```java
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.DynamicStack;   
  import com.fernando.estrutura_de_dados_em_java.stack_example.stack.Stack;
  
  public class StackUpdateMethodExample {
      public static void main(String[] args){
          Stack<Integer> numbers = new DynamicStack<>();
          numbers.push(1);
          numbers.push(2);
          numbers.push(3);

          numbers.update(20);

          System.out.print(numbers);

          // [1, 2, 20]
      }
  }
  ```
  

## Fila

## Lista encadeada

## Árvore

## Árvore binária (opcional)
