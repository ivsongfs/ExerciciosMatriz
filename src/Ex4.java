import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		byte opcao;

		while (!sair) {

			System.out.println("Digite 1 para adcionar compromisso.");
			System.out.println("Digite 2 para consultar compromisso.");
			System.out.println("Digite 0 para sair compromisso.");
			System.out.print("Opcao: ");
			
			opcao = scan.nextByte();

			if (opcao == 1) {
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {

					System.out.print("Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido digite novamente!");
					}

					boolean horaValido = false;
					int hora = 0;
					while (!horaValido) {

						System.out.print("Entre com a hora do compromisso: ");
						hora = scan.nextInt();
						if (hora >= 0 && hora <= 24) {
							horaValido = true;
						} else {
							System.out.println("Hora inválida digite novamente!");
						}

					}
					System.out.print("Digite o compromisso: ");
					compromissos[--dia][hora] = scan.next();

				}
			} else if (opcao == 2) {
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {

					System.out.print("Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido digite novamente!");
					}

					boolean horaValido = false;
					int hora = 0;
					while (!horaValido) {

						System.out.print("Entre com a hora do compromisso: ");
						hora = scan.nextInt();
						if (hora >= 0 && hora <= 24) {
							horaValido = true;
						} else {
							System.out.println("Hora inválida digite novamente!");
						}

					}
						
					System.out.println("O compromisso agendado é: ");
					System.out.println(compromissos[--dia][hora]);
					
			} 
			}
				else if (opcao == 0) {
				sair = true;
			}

		}
		
		scan.close();
	}

}
