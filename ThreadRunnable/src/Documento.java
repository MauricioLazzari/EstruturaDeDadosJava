public class Documento {

    public String nome;
    public double tamanho;
    public int numeroDocs = 0;
    public int tempo;

    public Documento(String nome, double tamanho, int tempo) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.numeroDocs++;
        this.tempo = tempo;
    }

    public Documento() {

    }

}


