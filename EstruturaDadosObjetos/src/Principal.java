import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        //Criando objetos da classe carro com seus dados específicos de cada carro.
        Carro c1 = new Carro("X1", "BMW", 2012);
        Carro c2 = new Carro("Jetta", "WM", 2014);
        Carro c3 = new Carro("Sportage", "Kia", 2014);

        Carro c4 = new Carro("X1", "BMW", 2012);

        //Adicionando todos objetos(carros) ao vetor.
        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);

        //Salvando o resultado inteiro da busca na variável result.
        int result = vetor.buscaPosicao(c1);
        //Se o resultado for maior que -1, significa que existe o objeto no vetor.
        if(result > -1){
            System.out.println("Elemento existe no vetor!");
        }else{
            System.out.println("Elemento não existe no vetor!");
        }

        //Imprimindo o vetor e seus objetos.
        System.out.println(vetor.toString());

    }

}
