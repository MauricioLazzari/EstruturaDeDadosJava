import java.util.Objects;

public class Carro {

    String nome;
    String marca;
    int ano;

    public Carro(String nome, String marca, int ano){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Nome='" + nome + '\'' +
                ", Marca='" + marca + '\'' +
                ", Ano=" + ano +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;

        Carro carro = (Carro) o;

        if (getAno() != carro.getAno()) return false;
        if (!getNome().equals(carro.getNome())) return false;
        return getMarca().equals(carro.getMarca());
    }


}
