package com.projeto;

public class ArvoreBinaria<T extends Comparable<T>> {

    private NoBinario<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        NoBinario<T> novoNo = new NoBinario<>(conteudo);

        this.raiz = inserir(this.raiz, novoNo);
    }

    private NoBinario<T> inserir(NoBinario<T> atual, NoBinario<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsquerda(inserir(atual.getNoEsquerda(), novoNo));
        } else {
            atual.setNoDireita(inserir(atual.getNoDireita(), novoNo));
        }

        return atual;
    }

    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem");
        this.exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoBinario<T> atual) {
        if (atual != null) {
            this.exibirInOrdem(atual.getNoEsquerda());
            System.out.print(atual.getConteudo() + ", ");
            this.exibirInOrdem(atual.getNoDireita());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo PosOrdem");
        this.exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoBinario<T> atual) {
        if (atual != null) {
            this.exibirPosOrdem(atual.getNoEsquerda());
            this.exibirPosOrdem(atual.getNoDireita());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo PreOrdem");
        this.exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoBinario<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            this.exibirPreOrdem(atual.getNoEsquerda());
            this.exibirPreOrdem(atual.getNoDireita());
        }
    }

    public void remover(T conteudo) {
        try {
            NoBinario<T> atual = this.raiz;
            NoBinario<T> pai = null;
            NoBinario<T> filho = null;
            NoBinario<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;

                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsquerda();
                } else {
                    atual = atual.getNoDireita();
                }
            }

            if (atual == null) {
                System.out.println("Conteudo não encontrado. Bloco Try");
            }

            if (pai == null) {
                if (atual.getNoDireita() == null) {
                    this.raiz = atual.getNoEsquerda();
                } else if (atual.getNoEsquerda() == null) {
                    this.raiz = atual.getNoDireita();
                } else {
                    for (temp = atual, filho = atual.getNoEsquerda();
                         filho.getNoDireita() != null;
                         temp = filho, filho = filho.getNoEsquerda()) {

                        if (filho != atual.getNoEsquerda()) {
                            temp.setNoDireita(filho.getNoEsquerda());
                            filho.setNoEsquerda(this.raiz.getNoEsquerda());
                        }
                    }

                    filho.setNoDireita(this.raiz.getNoDireita());
                    this.raiz = filho;
                }

            } else if (atual.getNoDireita() == null) {
                if (pai.getNoEsquerda() == atual) {
                    pai.setNoEsquerda(atual.getNoEsquerda());
                } else {
                    pai.setNoDireita(atual.getNoEsquerda());
                }

            } else if (atual.getNoEsquerda() == null) {
                if (pai.getNoEsquerda() == atual) {
                    pai.setNoEsquerda(atual.getNoDireita());
                } else {
                    pai.setNoDireita(atual.getNoDireita());
                }

            } else {
                for (temp = atual, filho = atual.getNoEsquerda();
                     filho.getNoDireita() != null;
                     temp = filho, filho = filho.getNoDireita()) {

                    if (filho != atual.getNoEsquerda()) {
                        temp.setNoDireita(filho.getNoEsquerda());
                        filho.setNoEsquerda(atual.getNoEsquerda());
                    }
                    filho.setNoDireita(atual.getNoDireita());

                    if (pai.getNoEsquerda() == atual) {
                        pai.setNoEsquerda(filho);
                    } else {
                        pai.setNoDireita(filho);
                    }
                }
            }

        } catch (NullPointerException erro) {
            System.out.println("Conteudo não encontrado. Bloco Catch");
        }
    }
}
