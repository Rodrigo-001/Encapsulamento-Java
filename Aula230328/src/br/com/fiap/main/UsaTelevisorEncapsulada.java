//Programa para simular funcionalidades de uma TV (Definir e aumentar volume, definir e mudar canal)
//Foram usados conceitos de encapsulamento, laço de repetição, condicional, leitura e escrita

/*O programa pede para o usuário definir canal e volume inicialmente e logo após exibe menu para escolha da ação que será executada, após executação 
 * exibe menu de deseja continuar, e encerra ou retoma o laço do inicio*/
package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.bean.TelevisorEncapsulada;

public class UsaTelevisorEncapsulada {
	public static void main(String[] args) {
		TelevisorEncapsulada tv_samsumg = new TelevisorEncapsulada();
		//variáveis
		int canal, volume, escolha=0;
		int continuar=1;
		try {
			//entrada de dados pelo teclado
			Scanner entrada = new Scanner(System.in);
			System.out.println("\nDefina canal(2, 4, 5, 7 e 13): ");
			tv_samsumg.setCanal(entrada.nextInt());			
			System.out.println("\nDefina volume (0 - 20): ");
			tv_samsumg.setVolume(entrada.nextInt());
			tv_samsumg.mostrar();			
			while (continuar == 1) {				
				//entrada de dados pelo teclado - menu
				System.out.println("\nO que deseja fazer? \n(1)Definir outro canal"
						+ "\n(2)Definir novo volume\n(3)Aumentar o volume"
						+ "\n(4)Diminuir o volume\n");
				escolha = entrada.nextInt();
				//processamento e saída de dados
				if (escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4) {
					switch (escolha) {
					case 1:
						System.out.println("\nDefina canal(2, 4, 5, 7 e 13): ");
						tv_samsumg.setCanal(entrada.nextInt());
						break;
					case 2:
						System.out.println("\nDefina volume (0 - 20): ");
						tv_samsumg.setVolume(entrada.nextInt());
						break;
					case 3:
						System.out.println("Aumentando volume...");
						tv_samsumg.aumentarVolume();
						break;
					default:
						System.out.println("Diminuindo volume...");
						tv_samsumg.diminuirVolume();
						break;
					}
					tv_samsumg.mostrar();
					
					//encerra o laço
					System.out.println("\nContinuar?\n(1)Sim\n(2)Não\n");
					continuar = entrada.nextInt();
					
				} else {
					throw new Exception("Opção inválida. (1,2,3,4)");
				}
			}//fim do laço
			System.out.println("Fim da execução!");			
		} catch (Exception e) {	//regra de negócio - apenas números inteiros são aceitos
			System.out.println("Formato incorreto. Use apenas números!");
		}
		
	}	//fim da classe main
}
