package Projeto;

import java.util.Scanner;

public class ProjetoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner menu = new Scanner(System.in);

		System.out.println(" +---------------------------------------+");
		System.out.println(" |   Seja Bem-Vinde a ONG JAVA do Bem    |");
		System.out.println(" +---------------------------------------+\n");
		
		//Pedir infos
		
		System.out.println(" +---------------------------------------+");
		System.out.println(" |             Menu de Op��es            |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |  Op��o 1 - Ajudar Moradores de Rua    |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |  Op��o 2 - Ajudar Orfanatos Carentes  |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |  Op��o 3 - Ajudar Asilos Carentes     |");
		System.out.println(" +---------------------------------------+");

		System.out.println("\n ---------> Digite uma Op��o: ");
		
		int opcao = menu.nextInt();
		
		switch (opcao)
		{
			case 1: 
				System.out.println(" +---------------------------------------+");
				System.out.println(" |        -> Op��o 1 Selecionada <-      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     -> Ajudar Moradores de Rua <-     |");
				System.out.println(" +---------------------------------------+\n");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Como voc� gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");

				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |             Menu de Op��es            |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Op��o 1 - Doa��o em Dinheiro      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Op��o 2 - Doa��o de Alimentos     |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" | Op��o 3 - Doa��o de Roupas/Brinquedos |");
				System.out.println(" +---------------------------------------+");

				System.out.println("\n ---------> Digite uma Op��o: ");
				
				int opcao1 = menu.nextInt();
				
				switch (opcao1)
				{
					case 1:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |  Todo valor doado ser� convertido em  |");
					System.out.println(" |      alimentos,cobertores, roupas     |");
					System.out.println(" |    medicamentos e itens de higiene    |");
					System.out.println(" +---------------------------------------+");
					
					
					System.out.println("\n------> Qual Valor voc� deseja doar: ");
					
					
					Float valor=menu.nextFloat();
					
					System.out.println(" +---------------------------------------+");
					System.out.println(" | Seu boleto de R$"+valor+" est� pronto ");
					System.out.println(" |   Acesse no link https://ong.org/pay  |");
					System.out.println(" +---------------------------------------+");
					
					break;
				
					case 2:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |  Suas doa��es de alimentos devem ser  |");
					System.out.println(" |  entregues no nosso ponto de coleta   |");
					System.out.println(" |     Localizado na Rua N� Bairro SP    |");
					System.out.println(" | Hor�rio de Atendimento 08:00 as 17:00 |");
					System.out.println(" +---------------------------------------+");
					break;
				
					case 3:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |   Suas doa��es de roupas/brinquedos   |");
					System.out.println(" |     devem ser entregues no nosso      |");
					System.out.println(" |           ponto de coleta             |");
					System.out.println(" |     Localizado na Rua N� Bairro SP    |");
					System.out.println(" | Hor�rio de Atendimento 08:00 as 17:00 |");
					System.out.println(" +---------------------------------------+");
					break;
					default:
						System.out.println("Op��o Inv�lida");
					break;
				}	
				break;
				
			
			case 2:
				System.out.println("Op��o -> Ajudar Orfanatos Carentes Selecionada");
				System.out.println("Como voc� gostaria de ajudar?");
				
				System.out.println("Op��o 1 - Doa��o em dinheiro");
				System.out.println("Op��o 2 - Doa��o de Alimentos");
				System.out.println("Op��o 3 - Doa��o de Roupas/Brinquedos");

				System.out.println("Digite uma Op��o: ");
				
				int opcao2 = menu.nextInt();
				
				switch (opcao2)
				{
					case 1:
					System.out.println("\nTodo valor doado ser� somado a outras doa�oes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
					System.out.println("\nQual valor voc� deseja doar? ");
					 
					Float valor=menu.nextFloat();
					System.out.println("\nSeu boleto no valor de "+valor+" est� pronto. Clique no link para ser redirecionado https://ong.org");
					break;
				
					case 2:
					System.out.println("\nSuas doa��es de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
							+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
					break;
				
					case 3:
					System.out.println("\nSuas doa��es de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
							+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
					break;
					default:
						System.out.println("Op��o Inv�lida");
					break;
				}
			break;
			
			case 3: 
				System.out.println("Op��o-> Ajudar Asilos Carentes");
				System.out.println("Como voc� gostaria de ajudar?");
				
				System.out.println("Op��o 1 - Doa��o em dinheiro");
				System.out.println("Op��o 2 - Doa��o de Alimentos");
				System.out.println("Op��o 3 - Doa��o de Roupas/Brinquedos");

				System.out.println("Digite uma Op��o: ");
				
				int opcao3 = menu.nextInt();
				
				switch (opcao3)
				{
					case 1:
					System.out.println("\nTodo valor doado ser� somado a outras doa�oes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
					System.out.println("\nQual valor voc� deseja doar? ");
					 
					Float valor=menu.nextFloat();
					System.out.println("\nSeu boleto no valor de "+valor+" est� pronto. Clique no link para ser redirecionado https://ong.org");
					break;
				
					case 2:
					System.out.println("\nSuas doa��es de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
							+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
					break;
				
					case 3:
					System.out.println("\nSuas doa��es de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
							+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
					break;
					default:
						System.out.println("Op��o Inv�lida");
					break;
				}
			break;
			default:
				System.out.println("Op��o Inv�lida");
			break;
		}
	}

}
