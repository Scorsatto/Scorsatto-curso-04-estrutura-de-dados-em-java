package com.projeto;

public class Pilha {
    private No referenciaNoEntradaPilha;

    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setReferenciaNo(refAuxiliar);
    }

    public No pop(){
        if (!this.isEmpty()){
            No noPoped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo();
            return noPoped;
        }

        return null;
    }

    public No top(){
        return referenciaNoEntradaPilha;
    }

    public boolean isEmpty(){
        return referenciaNoEntradaPilha == null ? true : false;
    }
}
