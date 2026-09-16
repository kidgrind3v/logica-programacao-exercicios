import java.util.ArrayList;
import java.util.Scanner;

public class Praticando07 {
//arrays/collections
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        ArrayList<String> listaDeTarefas = new ArrayList<>();
        
        String op = "";
       
        while(!op.equalsIgnoreCase("Sair")){
            //enquanto op não for igual a sair, continue
             System.out.println("Digite uma tarefa (ou 'sair' para parar): ");
             op = sc.nextLine();

             //se op não é igual a sair, adicionar op na lista
             if(!op.equalsIgnoreCase("Sair")){
                 listaDeTarefas.add(op);
             }
        }
        System.out.println("Saindo.....");
        
        //prefiro o for tradicional
        for (String lista : listaDeTarefas) {
            System.out.println("Exibindo tarefas: " + lista);
        }
        
        sc.close();
    }
}

