import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {

		int[][] numeros = new int[4][4];

		Random nr = new Random();

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = nr.nextInt(100);
			}
		}

		int maior = 0;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				if (numeros[i][j] > maior) {

					maior = numeros[i][j];
					linha = i;
					coluna = j;

				}

			}
		}

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("Maior numero: " + maior);
		System.out.println("Posição: " + linha + "," + coluna);
	}

}
