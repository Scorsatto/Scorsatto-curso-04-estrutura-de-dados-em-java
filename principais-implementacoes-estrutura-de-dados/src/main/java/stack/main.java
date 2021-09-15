package stack;

import model.Carro;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Carro> pilha = new Stack<>();

        pilha.push(new Carro("Ford"));
        pilha.push(new Carro("Chevrolet"));
        pilha.push(new Carro("Fiat"));
        System.out.println(pilha);

        System.out.println(pilha.pop());
        System.out.println(pilha);

        System.out.println(pilha.peek());
        System.out.println(pilha);

        System.out.println(pilha.empty());
    }
}
