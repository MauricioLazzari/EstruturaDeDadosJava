import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        //Vetor criado com o tamanho de 3 posi��es.
        //0 ao 4.
        Vetor vetor = new Vetor(5);

        //Dispon�veis os m�todos:
        //Adicionar(Elemento)
        //Adicionar(Posi��o, Elemento)
        //Remover(Posi��o)
        //BuscaPosicao(Elemento)

        vetor.adicionar("Ferrari");
        vetor.adicionar("Mercedes");
        vetor.adicionar("Jetta");
        vetor.remover("Jetta");

        System.out.println(vetor);

    }

}
