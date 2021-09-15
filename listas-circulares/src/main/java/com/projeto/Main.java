package com.projeto;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> lista = new ListaCircular<>();

        lista.add("c0");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        lista.add("c1");
        lista.add("c2");
        lista.add("c3");

        System.out.println(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
    }
}
