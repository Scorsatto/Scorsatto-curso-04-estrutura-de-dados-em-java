package com.projeto;

public class Fila {

    private No referenciaNoEntrada;

    public Fila() {
        this.referenciaNoEntrada = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setReferenciaNo(this.referenciaNoEntrada);
        this.referenciaNoEntrada = novoNo;
    }

    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = this.referenciaNoEntrada;

            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    break;
                }
            }

            return primeiroNo;
        }

        return null;
    }

    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = this.referenciaNoEntrada;
            No noAuxiliar = this.referenciaNoEntrada;

            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }

            return primeiroNo;
        }

        return null;
    }

    public boolean isEmpty() {
        return this.referenciaNoEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String retorno = "";

        No noAuxiliar = this.referenciaNoEntrada;

        if (this.referenciaNoEntrada != null) {
            while (true) {
                retorno += "[No{Object=" + noAuxiliar.getObject() + "}]--->";

                if (noAuxiliar.getReferenciaNo() != null) {
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                } else {
                    retorno += "null";
                    break;
                }
            }
        } else {
            retorno = "null";
        }

        return retorno;
    }
}
