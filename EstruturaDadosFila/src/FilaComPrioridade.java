public class FilaComPrioridade<T> extends Fila<T>{

    @Override
    public void enfileira(T elemento) {

        Comparable<T> chave = (Comparable<T>) elemento;

        for(int i = 0; i < this.getTamanho(); i++){
            if(chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }

    }
}
