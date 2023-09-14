package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ConjuntoLinkedList {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Jaguar");
        fila.offer("Ford");
        fila.add("Ferrari");
        fila.offer("Renault"); // Lança uma exeception caso a fila esteja cheia
        fila.add("Ferrari");
        fila.offer("Chevrolet"); // retorna falso caso a fila esteja cheia

        // Peek pega o primeiro elemento da fila, caso a fila for vazia retornara NULL
        System.out.println(fila.peek());
        // element pega o primeiro elemento da fila, caso a fila esteja vazia vai gerar uma exception
        System.out.println(fila.element());

        //fila.poll(); e fila.remove(); -> obtém o próximo elemento e remove da fila.

        System.out.println(fila.poll()); // retorna NULL caso a fila esteja vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // retorna uma exception caso a fila esteja vazia

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(object);
    }
}
