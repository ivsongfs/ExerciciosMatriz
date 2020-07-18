import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];
		boolean sair = false;
		byte opcao;

		

		

		while (!sair) {
			
			System.out.println("Digite 1 para adcionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");

			System.out.print("Opcao: ");
			opcao = scan.nextByte();
			
			if (opcao == 1) {

				boolean diaValido = false;
				int dia = 0;
				

				while (!diaValido) {
					System.out.print("Digite o dia do compromisso: ");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido digite novamente!");
					}

					boolean horaValida = false;
					int hora = 0;
					
					while (!horaValida) {
						System.out.println("Digite a hora do compromisso: ");
						hora = scan.nextInt();

						if (hora >= 0 && hora <= 24) {
							horaValida = true;
						} else {
							System.out.println("Hora inválida, digite novamente!");
						}

					}

					System.out.println("Digite o compromisso: ");
					compromissos[dia][hora] = scan.next();
				}
			} else if (opcao == 2) {

				boolean diaValido = false;
				int dia = 0;
				int hora = 0;

				while (!diaValido) {
					System.out.print("Digite o dia do compromisso: ");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido digite novamente!");
					}
				}

				boolean horaValida = false;

				while (!horaValida) {
					System.out.println("Digite a hora do compromisso: ");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente!");
					}

				}

				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			}

		}

	}

}
