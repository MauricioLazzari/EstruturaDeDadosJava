package pilha;
public class Principal{

    public static void main (String [] args){

        Pilha<Integer> pilha = new Pilha<>();

        //Imprime se a pilha está vazia. True para sim e False para não.
        //System.out.println(pilha.estaVazia());

        //Empilha dados na pilha.
        pilha.empilhar(1546); //0
        pilha.empilhar(9999); //1
        pilha.empilhar(1111); //2
        pilha.empilhar(7896); //3
        pilha.empilhar(8858); //4

        //Desempilhando o último dado da pilha.
        System.out.println("Desempilhando elemento: " + pilha.desempilhar());

        //Busca o conteúdo do último elemento na pilha.
        //System.out.println(pilha.buscaTopo());

        //Exibe os elementos salvos no vetor de pilha.
        System.out.println(pilha);

        System.out.println(pilha.getTamanho());


    }

}
