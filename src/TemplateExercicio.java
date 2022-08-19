package desafioemaula;

import java.util.Scanner;

public class TemplateExercicio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeroUm;
		int numeroDois;

		boolean continuar = true;
		do {	
			System.out.println("entre com o primeiro numero: ");
			numeroUm = teclado.nextInt();

			System.out.println("entre com a operacao: (+, -, *, /)");
			String operacao = teclado.next();

			System.out.println("entre com o segundo numero: ");
			numeroDois = teclado.nextInt();

			if (operacao.equals("+")) {
				System.out.println("Resultado = " + (numeroUm + numeroDois));
			} else if (operacao.equals("-")) {
				System.out.println("Resultado = " + (numeroUm - numeroDois));
			} else if (operacao.equals("*")) {
				System.out.println("Resultado = " + (numeroUm * numeroDois));
			} else if (operacao.equals("/")) {
				System.out.println("Resultado = " + (numeroUm / numeroDois));
			}
			System.out.println();
			System.out.println("Deseja continuar?");
			Scanner recebe = new Scanner(System.in);
			String armazena = recebe.nextLine();
			if ("sim".equals(armazena)) {
			} else {
				System.out.println("Saindo");
				continuar = false;
			}
			recebe.close();
		} while (continuar);
		teclado.close();
	}
}
