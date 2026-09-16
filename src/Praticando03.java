import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("### Verificador de  Par ou Ímpar ###");
		System.out.println("Digite o numero: ");
		int valorDigitado = sc.nextInt();
		
		if(valorDigitado % 2 == 0){
			System.out.println("O número "+valorDigitado+" é PAR!");
 		}else{
 			System.out.println("O número "+valorDigitado+" é ÍMPAR!");
		}
		System.out.println("#####-----FIM------- #####");
	   sc.close();
	}
}
//1 - ler valor digitado
//2 - verificar se o numero é dividido por 2 
//3 - mostrar valor
