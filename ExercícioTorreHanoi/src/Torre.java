import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Torre {

    public static void main(String[] args) {

        int movimentos = 0;

        //Classe Scanner para receber valor do teclado do usuário.
        Scanner teclado = new Scanner(System.in);

        //Pilhas da torre.
        Stack<Integer> torre1 = new Stack<>();
        Stack<Integer> torre2 = new Stack<>();
        Stack<Integer> torre3 = new Stack<>();

        //1° Torre irá iniciar com os três discos, sendo o 1° o maior e o 3° o menor.
        torre1.push(1);
        torre1.push(2);
        torre1.push(3);

        System.out.println("Bem vindo a Torre de Hanoi!");
        System.out.println("------> REGRAS <------");
        System.out.println("1) Você deverá mover os números para terceira torre!");
        System.out.println("2) Os números devem ficar em ordem crescente nas torres!");
        System.out.println("Exemplo: [1,2] ou [2,3] ou [1,3]");
        System.out.println("------> DICA <------");
        System.out.println("O número mínimo de jogadas é 7!");
        System.out.println("BOA SORTE! \n \n \n");

        System.out.println("Torre 1:" + torre1.toString());
        System.out.println("Torre 2:" + torre2.toString());
        System.out.println("Torre 3:" + torre3.toString());

        System.out.println("Para qual torre você quer mover o disco? Torre 2 ou 3 ?");
        int torre = teclado.nextInt();
        switch (torre) {
            case 2:
                torre2.push(torre1.pop());
                movimentos++;
                break;
            case 3:
                torre3.push(torre1.pop());
                movimentos++;
                break;
            default:
                System.out.println("Torre não existente! Jogo Finalizado!");
        }

        int torreOrigem = 0;
        int torreDestino = 0;

        while (torre3.size() < 3) {
            System.out.println("Torre 1:" + torre1.toString());
            System.out.println("Torre 2:" + torre2.toString());
            System.out.println("Torre 3:" + torre3.toString());

            System.out.println("Escolha a torre de *ORIGEM* para mover o próximo disco! ");
            torreOrigem = teclado.nextInt();
            //Se a torre de origem for igual a 1.
            if (torreOrigem == 1) {
                //Se a torre não for vazia.
                if (!torre1.isEmpty()) {
                    System.out.println("Para qual torre *DESTINO* você quer mover o disco? ");
                    torreDestino = teclado.nextInt();
                    //Se a torre destino for igual a 1 não é possível mover para ela mesma.
                    if (torreDestino == 1) {
                        System.out.println("************ Não é possível mover para ela mesma! ************");
                        //Se a torre destino for igual a 2.
                    } else if (torreDestino == 2) {
                        if (torre2.isEmpty()) {
                            torre2.push(torre1.pop());
                            movimentos++;
                        } else if (torre1.peek() > torre2.peek()) {
                            torre2.push(torre1.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre1.peek() + ") é menor que o da torre 2.");
                        }
                        //Se a torre destino for igual a 3.
                    } else if (torreDestino == 3) {
                        if (torre3.isEmpty()) {
                            torre3.push(torre1.pop());
                            movimentos++;
                        } else if (torre1.peek() > torre3.peek()) {
                            torre3.push(torre1.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre1.peek() + ") é menor que o da torre 3.");
                        }
                    }
                }
            } else if (torreOrigem == 2) {
                if (!torre2.isEmpty()) {
                    System.out.println("Para qual torre você quer mover o disco? ");
                    torreDestino = teclado.nextInt();
                    if (torreDestino == 2) {
                        System.out.println("************ Não é possível mover para ela mesma! ************");
                    } else if (torreDestino == 1) {
                        if (torre1.isEmpty()) {
                            torre1.push(torre2.pop());
                            movimentos++;
                        } else if (torre2.peek() > torre1.peek()) {
                            torre1.push(torre2.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre1.peek() + ") é menor que o da torre 2.");
                        }
                    } else if (torreDestino == 3) {
                        if (torre3.isEmpty()) {
                            torre3.push(torre2.pop());
                            movimentos++;
                        } else if (torre2.peek() > torre3.peek()) {
                            torre3.push(torre2.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre3.peek() + ") é menor que o da torre 2.");
                        }
                    }
                }
            } else if (torreOrigem == 3) {
                if (!torre3.isEmpty()) {
                    System.out.println("Para qual torre você quer mover o disco? ");
                    torreDestino = teclado.nextInt();
                    if (torreDestino == 3) {
                        System.out.println("************ Não é possível mover para ela mesma! ************");
                    } else if (torreDestino == 2) {
                        if (torre2.isEmpty()) {
                            torre2.push(torre3.pop());
                            movimentos++;
                        } else if (torre3.peek() > torre2.peek()) {
                            torre2.push(torre3.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre3.peek() + ") é menor que o da torre 2.");
                        }
                    } else if (torreDestino == 1) {
                        if(torre1.isEmpty()){
                            torre1.push(torre3.pop());
                            movimentos++;
                        }else if (torre1.peek() > torre3.peek()) {
                            torre1.push(torre3.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre3.peek() + ") é menor que o da torre 1.");
                        }
                    }
                }
            }

        }

        if (torre3.size() == 3) {
            System.out.println("Parabéns, você conclui a torre de Hanoi!");
            System.out.println("Você fez um total de: " + movimentos + " movimentos!");
        }
    }
}
