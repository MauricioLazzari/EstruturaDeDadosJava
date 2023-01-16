import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        //Instanciando a classe Vetor e passando que o tipo do objeto será String.
        Vetor<String> nomes = new Vetor(3);

        nomes.adicionar("Maurício");
        nomes.adicionar("José");
        nomes.adicionar("Lazzari");

        Vetor<Integer> numeros = new Vetor(5);

        numeros.adicionar(5);
        numeros.adicionar(4);
        numeros.adicionar(3);
        numeros.adicionar(2);
        numeros.adicionar(1);

        System.out.println(nomes.toString());
        System.out.println(numeros.toString());

    }

}
