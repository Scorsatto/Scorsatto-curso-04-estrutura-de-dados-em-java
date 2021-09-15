package set;

import model.Carro;
import model.CarroComparable;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> conjunto = new HashSet<>();

        conjunto.add(new Carro("Ford"));
        conjunto.add(new Carro("Chevrolet"));
        conjunto.add(new Carro("Fiat"));
        conjunto.add(new Carro("Peugeot"));
        conjunto.add(new Carro("Zip"));
        conjunto.add(new Carro("Alfa Romeo"));

        System.out.println(conjunto);

        Set<CarroComparable> arvore = new TreeSet<>();
        arvore.add(new CarroComparable("Ford"));
        arvore.add(new CarroComparable("Chevrolet"));
        arvore.add(new CarroComparable("Fiat"));
        arvore.add(new CarroComparable("Peugeot"));
        arvore.add(new CarroComparable("Zip"));
        arvore.add(new CarroComparable("Alfa Romeo"));

        System.out.println(arvore);
    }
}
