public class Praticando05 {
	public static void main(String[] args) {
		System.out.println("Somando pares do 1 atê 100");
		int soma = 0;
		for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
            	soma = soma + i;
            }
		}
		System.out.println("Resultado da soma: " +soma);
	}
}

