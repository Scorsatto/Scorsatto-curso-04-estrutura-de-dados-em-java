package com.projeto.atribuicaoreferencia;

public class MeuObj {
    Integer numero;

    public MeuObj(Integer numero) {
        this.numero = numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.numero.toString();
    }
}
