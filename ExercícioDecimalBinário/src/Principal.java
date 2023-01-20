import java.util.Stack;

public class Principal {

    public static void main(String[] args) {

        System.out.println(decimalBinario(25));

    }

    public static String decimalBinario(int numero) {

        Stack<Byte> pilha_binaria = new Stack<>();
        StringBuilder s = new StringBuilder();

        int resto;

        while (numero > 0) {
            resto = numero % 2; // 1
            byte resto_byte = (byte) resto;
            pilha_binaria.push(resto_byte);
            numero = numero / 2;
        }

        while (!pilha_binaria.isEmpty()) {
            s.append(pilha_binaria.pop());
        }
        return "Pilha finalizada! \n"
                + s.toString();
    }

}
