import java.util.Stack;

public class Simbolo {

    public static void main(String[] args) {

        resultado("(A+B) * 2 + 5");
        resultado("({(())}A + B + C )");

    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static void resultado(String expressao){
        System.out.println("Expressão está balanceada? " + verificaSimboloBalanceado(expressao));
    }

    public static boolean verificaSimboloBalanceado(String expressao) {
        Stack<Character> pilha_simbolos = new Stack<>();
        char topo;
        for (int i = 0; i < expressao.length(); i++) {
            char simbolo = expressao.charAt(i);
            if (ABRE.indexOf(simbolo) > -1) {
                pilha_simbolos.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha_simbolos.isEmpty()) {
                    return false;
                } else {
                    topo = pilha_simbolos.pop();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }
        }
        return pilha_simbolos.isEmpty();
    }

}
