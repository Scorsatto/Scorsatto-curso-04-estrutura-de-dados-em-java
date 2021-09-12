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

    @Override
    public String toString() {
        String retorno = "-----------\n";
        retorno += "   PILHA   \n";
        retorno += "-----------\n";

        No noAuxiliar =  referenciaNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                retorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            } else {
                break;
            }
        }
        retorno += "===========\n";

        return retorno;
    }
}
