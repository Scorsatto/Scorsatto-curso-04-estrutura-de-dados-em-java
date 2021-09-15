package equalshashcode;

import model.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> lista = new ArrayList<>();

        lista.add(new Carro("Ford"));
        lista.add(new Carro("Chevrolet"));
        lista.add(new Carro("Volkswagen"));

        System.out.println(lista.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
