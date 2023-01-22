import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Torre {

    public static void main(String[] args) {

        int movimentos = 0;

        //Classe Scanner para receber valor do teclado do usu�rio.
        Scanner teclado = new Scanner(System.in);

        //Pilhas da torre.
        Stack<Integer> torre1 = new Stack<>();
        Stack<Integer> torre2 = new Stack<>();
        Stack<Integer> torre3 = new Stack<>();

        //1� Torre ir� iniciar com os tr�s discos, sendo o 1� o maior e o 3� o menor.
        torre1.push(1);
        torre1.push(2);
        torre1.push(3);

        System.out.println("Bem vindo a Torre de Hanoi!");
        System.out.println("------> REGRAS <------");
        System.out.println("1) Voc� dever� mover os n�meros para terceira torre!");
        System.out.println("2) Os n�meros devem ficar em ordem crescente nas torres!");
        System.out.println("Exemplo: [1,2] ou [2,3] ou [1,3]");
        System.out.println("------> DICA <------");
        System.out.println("O n�mero m�nimo de jogadas � 7!");
        System.out.println("BOA SORTE! \n \n \n");

        System.out.println("Torre 1:" + torre1.toString());
        System.out.println("Torre 2:" + torre2.toString());
        System.out.println("Torre 3:" + torre3.toString());

        System.out.println("Para qual torre voc� quer mover o disco? Torre 2 ou 3 ?");
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
                System.out.println("Torre n�o existente! Jogo Finalizado!");
        }

        int torreOrigem = 0;
        int torreDestino = 0;

        while (torre3.size() < 3) {
            System.out.println("Torre 1:" + torre1.toString());
            System.out.println("Torre 2:" + torre2.toString());
            System.out.println("Torre 3:" + torre3.toString());

            System.out.println("Escolha a torre de *ORIGEM* para mover o pr�ximo disco! ");
            torreOrigem = teclado.nextInt();
            //Se a torre de origem for igual a 1.
            if (torreOrigem == 1) {
                //Se a torre n�o for vazia.
                if (!torre1.isEmpty()) {
                    System.out.println("Para qual torre *DESTINO* voc� quer mover o disco? ");
                    torreDestino = teclado.nextInt();
                    //Se a torre destino for igual a 1 n�o � poss�vel mover para ela mesma.
                    if (torreDestino == 1) {
                        System.out.println("************ N�o � poss�vel mover para ela mesma! ************");
                        //Se a torre destino for igual a 2.
                    } else if (torreDestino == 2) {
                        if (torre2.isEmpty()) {
                            torre2.push(torre1.pop());
                            movimentos++;
                        } else if (torre1.peek() > torre2.peek()) {
                            torre2.push(torre1.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre1.peek() + ") � menor que o da torre 2.");
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
                            System.out.println("Disco (" + torre1.peek() + ") � menor que o da torre 3.");
                        }
                    }
                }
            } else if (torreOrigem == 2) {
                if (!torre2.isEmpty()) {
                    System.out.println("Para qual torre voc� quer mover o disco? ");
                    torreDestino = teclado.nextInt();
                    if (torreDestino == 2) {
                        System.out.println("************ N�o � poss�vel mover para ela mesma! ************");
                    } else if (torreDestino == 1) {
                        if (torre1.isEmpty()) {
                            torre1.push(torre2.pop());
                            movimentos++;
                        } else if (torre2.peek() > torre1.peek()) {
                            torre1.push(torre2.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre1.peek() + ") � menor que o da torre 2.");
                        }
                    } else if (torreDestino == 3) {
                        if (torre3.isEmpty()) {
                            torre3.push(torre2.pop());
                            movimentos++;
                        } else if (torre2.peek() > torre3.peek()) {
                            torre3.push(torre2.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre3.peek() + ") � menor que o da torre 2.");
                        }
                    }
                }
            } else if (torreOrigem == 3) {
                if (!torre3.isEmpty()) {
                    System.out.println("Para qual torre voc� quer mover o disco? ");
                    torreDestino = teclado.nextInt();
                    if (torreDestino == 3) {
                        System.out.println("************ N�o � poss�vel mover para ela mesma! ************");
                    } else if (torreDestino == 2) {
                        if (torre2.isEmpty()) {
                            torre2.push(torre3.pop());
                            movimentos++;
                        } else if (torre3.peek() > torre2.peek()) {
                            torre2.push(torre3.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre3.peek() + ") � menor que o da torre 2.");
                        }
                    } else if (torreDestino == 1) {
                        if(torre1.isEmpty()){
                            torre1.push(torre3.pop());
                            movimentos++;
                        }else if (torre1.peek() > torre3.peek()) {
                            torre1.push(torre3.pop());
                            movimentos++;
                        } else {
                            System.out.println("Disco (" + torre3.peek() + ") � menor que o da torre 1.");
                        }
                    }
                }
            }

        }

        if (torre3.size() == 3) {
            System.out.println("Parab�ns, voc� conclui a torre de Hanoi!");
            System.out.println("Voc� fez um total de: " + movimentos + " movimentos!");
        }
    }
}
