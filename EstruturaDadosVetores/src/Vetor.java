import java.util.Arrays;
import java.util.Objects;

public class Vetor {

    String [] carros;
    private int ultimaPosicao;

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //Método construtor.
    //Inicializa o vetor com o tamanho de acordo com a capacidade passada como parâmetro.
    public Vetor(int capacidade) {
        carros = new String[capacidade];
        this.ultimaPosicao = 0;
    }
    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public int getUltimaPosicao() {
        return ultimaPosicao;
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //Método para adicionar elemento a um vetor.
    public void adicionar(String elemento) {
        //Caso o vetor atual esteja cheio (ultimaPosicao maior que o tamanho do vetor), cria um novo vetor com tamanho dobrado.
        dobraCapacidade();
        //Se a ultima posição for menor que o tamanho do vetor, então será possível adicionar elementos.
        if (ultimaPosicao < this.carros.length) {
            this.carros[ultimaPosicao] = elemento;
            this.ultimaPosicao++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Vetor cheio!");
        }
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //Método que adiciona um elemento na posição passada como parâmetro.
    public void adicionar(int posicao, String elemento) {
        dobraCapacidade();
        if (posicao >= 0 && posicao <= this.ultimaPosicao) {
            for (int i = this.ultimaPosicao; posicao < i; i--) {
                this.carros[i] = this.carros[i - 1];
            }
            this.carros[posicao] = elemento;
            this.ultimaPosicao++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição inválida! Maior ou menor que a capacidade do vetor!");
        }
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public boolean remover(int posicao) {
        if (posicao > 0 && posicao <= this.ultimaPosicao) {
            for (int i = posicao; i < ultimaPosicao; i++) {
                this.carros[i] = this.carros[i + 1];
            }
            this.ultimaPosicao--;
            return true;
        }
        return false;
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public boolean remover(String elemento) {
        for (int i = 0; i < this.carros.length; i++) {
            if (this.carros[i].equals(elemento)) {
                for (int j = 0; j < ultimaPosicao; j++) {
                    this.carros[i] = this.carros[i + 1];
                }
                this.ultimaPosicao--;
                return true;
            }
        }
        return false;
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public int buscaPosicao(String elemento) {
        for (int i = 0; i < ultimaPosicao; i++) {
            if (this.carros[i].equals(elemento)) {
                return i;
            }
        }
        return -1;

    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    private boolean dobraCapacidade() {
        if (ultimaPosicao >= this.carros.length) {
            String[] novosCarros = new String[this.carros.length * 2];
            for (int i = 0; i < this.carros.length; i++) {
                novosCarros[i] = this.carros[i];
            }
            this.carros = novosCarros;
            return true;
        }
        return false;
    }
    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //Método toString que retorna os elementos do vetor carros.
    @Override
    public String toString() {

        //Chamada da classe StringBuilder do java, objeto s.
        StringBuilder s = new StringBuilder();

        //Concatenando "[" no objeto s.
        s.append("[");

        //Iterando i de 0 até 4.
        for (int i = 0; i < ultimaPosicao - 1; i++) {
            //Concatenando cada elemento do vetor no objeto s. Só até o penúltimo.
            s.append(this.carros[i]);
            //Acrescentando vírgula após cada elemento.
            s.append(", ");
        }

        //Para que não haja vírgula após o último elemento, o mesmo é adicionado de forma separada.
        //Se última posição for maior que 0 (sempre será), então concatena a última posição que é 5-1 = 4 no objeto s.
        if (this.ultimaPosicao > 0) {
            s.append(this.carros[ultimaPosicao - 1]);
        }

        //Por fim, fecha o vetor.
        s.append("]");

        //Retorna o objeto s em toString.
        return s.toString();
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



}
