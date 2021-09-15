package model;

import java.util.Objects;

public class CarroComparable implements Comparable<CarroComparable> {

    String marca;

    public CarroComparable(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroComparable carro = (CarroComparable) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(CarroComparable o) {
        if (this.marca.length() < o.marca.length()) {
            return -1;
        } else if (this.marca.length() > o.marca.length()) {
            return 1;
        }

        return 0;
    }

    // Comparação em ordem alfabetica
//    @Override
//    public int compareTo(CarroComparable o) {
//        return  this.getMarca().compareTo(o.getMarca());
//    }
}
