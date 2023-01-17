package vetor;
import base.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T> {

    private int tamanho;

    public Lista(int capacidade){
        super(capacidade);
    }

    public Lista(){

    }

    public void adicionar(T elemento) {
        super.adicionar(elemento);
    }

    public void adicionar(int posicao, T elemento){
        super.adicionar(posicao, elemento);
    }


}
