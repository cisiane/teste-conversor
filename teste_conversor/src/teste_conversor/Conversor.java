package teste_conversor;

import java.util.Scanner;

public class Conversor {
	
	public static void exibirMenu() {
		
		System.out.println("Escolha uma das opções abaixo para a conversão.");
		System.out.println("1. De mm para cm");
		System.out.println("2. De mm para m");
		System.out.println("3. De cm para mm");
		System.out.println("4. De cm para m");
		System.out.println("5. De m para mm");
		System.out.println("6. De m para cm");
		System.out.println("7. Sair");
		
	}
	
	public static void conversor(String uniInicial, String uniFinal, double proporcao, Scanner valor) {
		System.out.println("Certo! Vamos converter: " + uniInicial + " -> " + uniFinal);
		System.out.println("Por favor, informe o valor que deseja converter.");
		double valorInicial = valor.nextDouble();
		double valorFinal = valorInicial * proporcao;
		System.out.println("Resultado: " + valorInicial + " " + uniInicial + " = " + valorFinal + " " + uniFinal);
	}

}
