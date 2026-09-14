import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("### - Tabuada - ###");
          int limite = 10;
          System.out.println("Digite o valor para iniciar a tabuada: ");
          int valorDigitado = sc.nextInt();
          
          for(int i = 1; i <= limitel; i++){
          	int resultado = valorDigitado * i;
          	System.out.println(valorDigitado+" X "+i+" = "+resultado);
          }
                       System.out.println("###----FIM----###");
          sc.close();
	}
}