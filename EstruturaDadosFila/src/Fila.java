import java.util.Arrays;

public class Fila<T> {

    public T[] elementos;
    private int tamanho;

    public Fila(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public Fila() {
        this(10);
    }

    public void enfileira(T elemento) {
        aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        tamanho++;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                novosElementos[i] = this.elementos[i];
            }
            this.elementos = novosElementos;
        }

    }

    public boolean estaVazia() {
        if (this.tamanho <= 0) {
            return true;
        }
        return false;
    }

    public T espiar() {
        if(estaVazia()){
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira() {
        T elementoRemovido = this.elementos[0];
        if (!estaVazia()) {
            for (int i = 0; i < this.tamanho-1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        }
        return elementoRemovido;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");
        for(int i = 0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        s.append(this.elementos[this.tamanho-1]);
        s.append("]");

        return s.toString();
    }

}
