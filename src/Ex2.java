import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {

		int[][] numeros = new int[10][10];

		Random nr = new Random();

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = nr.nextInt(100);
			}
			
		}
		
		//IMPRIMIR
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		int maior = 0;
		int menor = 101;
		int linha5 = 5;
		for (int i = 0; i < numeros[linha5].length; i++) {
			
				if (numeros[linha5][i] > maior) {
					maior = numeros[linha5][i];
				}	
				  if (numeros[linha5][i] < menor) {
					menor = numeros[linha5][i];
				  }
				}
			
		
		
		System.out.println("Maior da linha 5: " + maior);
		System.out.println("Menor da linha 5: " + menor);
		
		int maior2 = 0;
		int menor2 = 101;
		int col7 = 7;
		for(int i = 0; i <numeros.length; i++) {
			
				if(numeros[i][col7] > maior2) {
					maior2 = numeros[i][col7];
				} if(numeros[i][col7] < menor2) {
					menor2 = numeros[i][col7];
				}
			}
		
	
		System.out.println();
		System.out.println("Maior da coluna 7: " + maior2);
		System.out.println("Menor da coluna 7: " + menor2);

		

		
		
	}

}
