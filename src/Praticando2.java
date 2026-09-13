
import java.util.Scanner;

public class Praticando2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("### FRETE CALCULATE ####");

        System.out.println("Digite o peso por (KG): ");
        double peso = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a distacia por (km): ");
        int  distancia = sc.nextInt();
        sc.nextLine();
        double precoPorkm;

        if (peso <=  5){
            precoPorkm = 2.00;
        } else {
            precoPorkm = 3.50;
        }

        double valorFrete = precoPorkm * distancia;

        if (distancia > 100){
            valorFrete = valorFrete + (valorFrete * 0.15);
            System.out.println("Aplicando ACRÉSCIMO DE 15% ");
        }
        System.out.println("Valor final do frete "+"R$: "+valorFrete);

        sc.close();
    }
}

/*leia peso
leia distancia

se peso <= 5
    precoPorKm = 2.00
senao
    precoPorKm = 3.50
fimse

valorFrete = precoPorKm * distancia

se distancia > 100
    valorFrete = valorFrete + (valorFrete * 0.15)
fimse

escreva("Valor final do frete: " + valorFrete)*/
