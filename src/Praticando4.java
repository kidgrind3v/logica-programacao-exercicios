public class Main {
	public static void main(String[] args) {
	
		int[] arrayNum = {25,34,90};

 //assumindo que o primeiro é maior
		int maiorNum = arrayNum[0];
		 
	for(int i = 0; i < arrayNum.length;i++){
		if(arrayNum[i] > maiorNum){
			maiorNum = arrayNum[i];
		}
	}
		System.out.println("Maior numero: " + maiorNum);
	}
}

