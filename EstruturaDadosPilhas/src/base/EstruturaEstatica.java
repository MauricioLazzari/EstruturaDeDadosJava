package base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    protected void adicionar(T elemento) {
        //Caso o vetor atual esteja cheio (ultimaPosicao maior que o tamanho do vetor), cria um novo vetor com tamanho dobrado.
        aumentaCapacidade();
        //Se a ultima posi��o for menor que o tamanho do vetor, ent�o ser� poss�vel adicionar elementos.
        if (tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Vetor cheio!");
        }
    }

    protected void adicionar(int posicao, T elemento) {
        aumentaCapacidade();
        if (posicao >= 0 && posicao <= this.tamanho) {
            for (int i = this.tamanho; posicao < i; i--) {
                this.elementos[i] = this.elementos[i - 1];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição inv�lida! Maior ou menor que a capacidade do vetor!");
        }
    }

    public boolean remover(int posicao) {
        if (posicao > 0 && posicao <= this.tamanho) {
            for (int i = posicao; i < tamanho; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;
            return true;
        }
        return false;
    }

    public void empilhar(T elemento) {

    }

    protected boolean aumentaCapacidade() {
        if (this.tamanho >= this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novosElementos[i] = this.elementos[i];
            }
            this.elementos = novosElementos;
            return true;
        }
        return false;
    }

    public boolean estaVazia() {
        if(this.tamanho == 0){
            return true;
        }

        return false;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        //Chamada da classe StringBuilder do java, objeto s.
        StringBuilder s = new StringBuilder();

        //Concatenando "[" no objeto s.
        s.append("[");

        //Iterando i de 0 at� 4.
        for (int i = 0; i < this.tamanho - 1; i++) {
            //Concatenando cada elemento do vetor no objeto s. S� at� o pen�ltimo.
            s.append(this.elementos[i]);
            //Acrescentando v�rgula ap�s cada elemento.
            s.append(", ");
        }

        //Para que n�o haja v�rgula ap�s o �ltimo elemento, o mesmo � adicionado de forma separada.
        //Se �ltima posi��o for maior que 0 (sempre ser�), ent�o concatena a �ltima posi��o que � 5-1 = 4 no objeto s.
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        //Por fim, fecha o vetor.
        s.append("]");

        //Retorna o objeto s em toString.
        return s.toString();
    }


}
