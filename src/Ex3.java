import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite valor da linha " + (i) + " coluna " + (j)  + " : ");
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.println();
		
		int numerosPares = 0;
		int numerosImpares = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				if(matriz[i][j] % 2 == 0) {
					numerosPares++;
				}if(matriz[i][j] % 2 == 1) {
					numerosImpares++;
				}
				
			}
		}
		
		System.out.println();
		System.out.println("Numeros pares: " + numerosPares);
		System.out.println("Numeros impares: " + numerosImpares);

	}

}
