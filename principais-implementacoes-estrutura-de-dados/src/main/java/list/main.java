package list;

import model.Carro;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Carro> lista = new ArrayList<>();

        lista.add(new Carro("Ford"));
        lista.add(new Carro("Chevrolet"));
        lista.add(new Carro("Fiat"));
        lista.add(new Carro("Peugeot"));

        System.out.println(lista.contains(new Carro("Ford")));

        System.out.println(lista.get(2));

        System.out.println(lista.indexOf(new Carro("Ford")));

        System.out.println(lista.remove(2));
        System.out.println(lista);
    }
}
