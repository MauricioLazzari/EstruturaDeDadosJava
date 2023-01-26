import java.util.LinkedList;
import java.util.Queue;

public class Principal{

    public static void main(String [] args){

        Queue<Documento> lista_documentos = new LinkedList<>();

        Documento doc1 = new Documento("Boleto.pdf", 4.65, 3000);
        Documento doc2 = new Documento("Matrícula.docx", 5.65, 6000);
        Documento doc3 = new Documento("Planilha.xlsx", 455.2, 9000);
        Documento doc4 = new Documento("Contrato.pdf" , 122, 12000);


        lista_documentos.add(doc1);
        lista_documentos.add(doc2);
        lista_documentos.add(doc3);
        lista_documentos.add(doc4);


        Runnable t1 = new Runnable() {
            @Override
            public void run() {
               try{
                 while(!lista_documentos.isEmpty()){
                     Thread.sleep(3000);
                     System.out.println("Nome: " + lista_documentos.peek().nome);
                     System.out.println("Tamanho: " + lista_documentos.peek().tamanho + " KB!");
                     lista_documentos.remove();
                 }
               }catch (Exception e){}
            }
        };

        new Thread(t1).start();

    }

}
