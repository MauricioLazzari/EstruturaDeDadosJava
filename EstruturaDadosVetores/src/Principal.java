import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        //Vetor criado com o tamanho de 3 posições.
        //0 ao 4.
        Vetor vetor = new Vetor(5);

        //Disponíveis os métodos:
        //Adicionar(Elemento)
        //Adicionar(Posição, Elemento)
        //Remover(Posição)
        //BuscaPosicao(Elemento)

        vetor.adicionar("Ferrari");
        vetor.adicionar("Mercedes");
        vetor.adicionar("Jetta");
        vetor.remover("Jetta");

        System.out.println(vetor);

    }

}
