package pilha;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(int capacidade){
        super(capacidade);
    }

    public Pilha(){
        super();
    }

    public void empilhar(T elemento){
        super.adicionar(elemento);
    }

}
