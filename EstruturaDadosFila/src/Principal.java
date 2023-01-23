public class Principal {

    public static void main(String[] args) {

        Fila<String> fila_pessoas = new Fila<>(3);

        //Adicionando pessoas a fila.
        fila_pessoas.enfileira("Maur�cio");//0
        fila_pessoas.enfileira("Mariana"); //1
        fila_pessoas.enfileira("Lazzari"); //2
        fila_pessoas.enfileira("Messi");   //3

        //Exibindo a fila com as 4 pessoas.
        System.out.println(fila_pessoas.toString());

        //Removendo as 2 primeiras pessoas da fila.
        System.out.println(fila_pessoas.desenfileira() + " saiu da fila!");
        System.out.println(fila_pessoas.desenfileira() + " saiu da fila!");

        //Exibindo a fila ap�s remover as 2 pessoas.
        System.out.println(fila_pessoas.toString());

        //Verifica se a fila est� vazia.
        if(fila_pessoas.estaVazia()){
            System.out.println("A fila est� vazia!");
        }else{
            System.out.println("A fila n�o est� vazia!");
        }

        //Removendo mais uma pessoa da fila.
        System.out.println(fila_pessoas.desenfileira() + " saiu da fila!");

        //Verifica se a fila est� vazia.
        if(fila_pessoas.estaVazia()){
            System.out.println("A fila est� vazia!");
        }else{
            System.out.println("A fila n�o est� vazia!");
        }

        //Espiando a primeira pessoa da fila.
        if(fila_pessoas.espiar() == null){
            System.out.println("N�o h� ningu�m na fila!");
        }else{
            System.out.println("Primeira pessoa da fila: " + fila_pessoas.espiar());
        }

    }

}
