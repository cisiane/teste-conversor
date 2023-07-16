package teste_conversor;

import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			int input = 0; //guardar o que o usuario digitar
			
			System.out.println("Bem vindo ao Conversor!");
			
			while(input != 7) {
				Conversor.exibirMenu();
				input = entrada.nextInt();
				
				switch(input) {
				
				case 1:
					Conversor.conversor("mm", "cm", 0.1, entrada);
					
					break;
				case 2:
					Conversor.conversor("mm", "m", 0.001, entrada);
					break;
				case 3:
					Conversor.conversor("cm", "mm", 10, entrada);
					break;
				case 4:
					Conversor.conversor("cm", "m", 0.01, entrada);
					break;
				case 5:
					Conversor.conversor("m", "mm", 1000, entrada);
					break;
				case 6:
					Conversor.conversor("m", "cm", 100, entrada);
					break;
				case 7:
					System.out.println("Encerrando conversor.");
					break;
				default:
					System.out.println("Opção inválida.");
					break;
				
				}
				
				System.out.println();
			}
		}
		

	}

}
