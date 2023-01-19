import java.util.EmptyStackException;
import java.util.Stack;

public class Principal {

    public static void main(String [] args){

        Stack<Object> pilha_livros = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setAutor("Maurício José Lazzari");
        livro1.setNome_livro("Eficiência em JAVA!");
        livro1.setData_lancamento("2012");

        Livro livro2 = new Livro();
        livro2.setAutor("Elon Musk");
        livro2.setNome_livro("Fabricando Teslas!");
        livro2.setData_lancamento("2015");

        pilha_livros.push(livro1);
        pilha_livros.push(livro2);

        System.out.println(String.format("Foram empilhados %d livros", pilha_livros.size()));
        System.out.println(pilha_livros.toString());

        while(!pilha_livros.isEmpty()){
            System.out.println("Desempilhando livro: " + pilha_livros.pop());
        }

        System.out.println("Todos livros foram desempilhados!");
        System.out.println(pilha_livros.toString());

        try{
            pilha_livros.pop();
        }catch (EmptyStackException e){
            System.out.println("Pilha vazia, não é possível desempilhar!");
        }





    }

}
