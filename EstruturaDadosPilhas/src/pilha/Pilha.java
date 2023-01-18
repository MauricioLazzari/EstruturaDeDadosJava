package pilha;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
        super();
    }

    public void empilhar(T elemento) {
        super.adicionar(elemento);
    }

    public T desempilhar() {
        if (this.estaVazia()) {
            return null;
        }
        //Elemento que será removido.
        T elemento = this.elementos[this.tamanho-1];

        //Setando o elemento que será removido como null.
        this.elementos[this.tamanho-1] = null;

        //Decrementando o tamanho, pois o último elemento foi removido.
        this.tamanho--;

        //Retornando qual elemento foi removido.
        return elemento;

    }

    public boolean estaVazia() {
        return super.estaVazia();
    }

    public T buscaTopo() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[this.tamanho - 1];
    }

    public String toString() {
        return super.toString();
    }
}

