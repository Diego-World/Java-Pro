package Collections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Homem mais rico da babilônia");
        livros.push("Don Quixote");
        livros.push("Cracking the code interview");

        System.out.println(livros);
        System.out.println("---------------------------------");

        //Last in first out - FIFO
        // peek pega o primeiro elemento da fila, caso a fila for vazia retornara NULL
        // element pega o primeiro elemento da fila, caso a fila esteja vazia vai gerar uma exception
        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println("---------------------------------");
        //fila.poll(); e fila.remove(); -> obtém o próximo elemento e remove da fila.
        System.out.println(livros.remove());
        System.out.println(livros.poll()); // Caso a lista esteja vazia retorna null
        System.out.println(livros.pop()); // Caso a lista esteja vazia retorna uma exception assim como o remove

        System.out.println(livros);
    }
}
