package com.projeto;

public class NoBinario<T extends Comparable<T>> {

    private T conteudo;
    private NoBinario<T> noEsquerda;
    private NoBinario<T> noDireita;

    public NoBinario(T conteudo) {
        this.noEsquerda = this.noDireita = null;
        this.conteudo = conteudo;
    }

    public NoBinario() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBinario<T> getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(NoBinario<T> noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public NoBinario<T> getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(NoBinario<T> noDireita) {
        this.noDireita = noDireita;
    }

    @Override
    public String toString() {
        return "NoBinario{" +
                "conteudo=" + conteudo +
                '}';
    }
}
