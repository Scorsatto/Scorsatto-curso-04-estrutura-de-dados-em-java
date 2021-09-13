package com.project;

public class ListaEncadeada<T> {

    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            this.referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = this.referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {

        validaIndice(index);

        No<T> noAuxiliar = this.referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public T remove(int index) {
        No<T> noPivo = this.getNo(index);

        if (index == 0) {
            this.referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = this.getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    public int size() {
        int tamanhoLista = 0;

        No<T> referenciaAuxiliar = this.referenciaEntrada;
        while (true) {
            if (referenciaAuxiliar != null) {
                tamanhoLista++;
                if (referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    public void validaIndice(int index) {
        if (index >= this.size()) {
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice: " + index + " desta lista. Esta lista só vai até o indice: " + ultimoIndice + ".");
        }
    }

    public boolean isEmpty() {
        return this.referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String retorno = "";
        
        No<T> noAuxiliar = this.referenciaEntrada;

        for (int i = 0; i < this.size(); i++) {
            retorno += "[No{Conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();

        }
        retorno += "null";

        return retorno;
    }
}
