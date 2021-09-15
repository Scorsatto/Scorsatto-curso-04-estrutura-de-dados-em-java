package queue;

import model.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> fila = new LinkedList<>();

        fila.add(new Carro("Ford"));
        fila.add(new Carro("Chevrolet"));
        fila.add(new Carro("Fiat"));

        System.out.println(fila.add(new Carro("Peugeot")));
        System.out.println(fila);

        System.out.println(fila.offer(new Carro("Renault")));
        System.out.println(fila);

        System.out.println(fila.peek());
        System.out.println(fila);

        System.out.println(fila.poll());
        System.out.println(fila);

        System.out.println(fila.isEmpty());
        System.out.println(fila.size());
    }
}
