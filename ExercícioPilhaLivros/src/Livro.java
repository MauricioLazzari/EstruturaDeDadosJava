public class Livro {

    private String nome_livro;
    private String autor;
    private String data_lancamento;

    public Livro(){

    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome_livro='" + nome_livro + '\'' +
                ", autor='" + autor + '\'' +
                ", data_lancamento='" + data_lancamento + '\'' +
                '}';
    }
}
