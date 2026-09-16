import java.util.Scanner;
public class Praticando1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto  = sc.nextDouble();
        sc.nextLine();

        System.out.println("Qual a forma de pagamento: ");
        String formaDePagamento = sc.nextLine();

        if(formaDePagamento.equalsIgnoreCase("Avista")){
            double valorComDesconto = valorProduto -(valorProduto*0.10);
            System.out.println("Valor com desconto: " + "R$: " + valorComDesconto);

        } else if(formaDePagamento.equalsIgnoreCase("Parcelar")){
            System.out.println("Quer parcela em quantas vezes?");
            int quantidadeDeParcelas = sc.nextInt();

            double valorParcela = valorProduto / quantidadeDeParcelas;

            if(valorParcela < 50){
            System.out.println("Não é possivel parcelar dessa forma, parcela ficaria menor que R$: 50");
            } else {
                System.out.println("Cada parcela será de "  + "R$: " + valorParcela);
            }
        } else {
            System.out.println("Valor invalido!");
        }
        sc.close();
    }
}



