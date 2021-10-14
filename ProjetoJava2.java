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
		System.out.println(" |             Menu de Opções            |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |  Opção 1 - Ajudar Moradores de Rua    |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |  Opção 2 - Ajudar Orfanatos Carentes  |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |  Opção 3 - Ajudar Asilos Carentes     |");
		System.out.println(" +---------------------------------------+");

		System.out.println("\n ---------> Digite uma Opção: ");
		
		int opcao = menu.nextInt();
		
		switch (opcao)
		{
			case 1: 
				System.out.println(" +---------------------------------------+");
				System.out.println(" |        -> Opção 1 Selecionada <-      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     -> Ajudar Moradores de Rua <-     |");
				System.out.println(" +---------------------------------------+\n");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Como você gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");

				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |             Menu de Opções            |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Opção 1 - Doação em Dinheiro      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Opção 2 - Doação de Alimentos     |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" | Opção 3 - Doação de Roupas/Brinquedos |");
				System.out.println(" +---------------------------------------+");

				System.out.println("\n ---------> Digite uma Opção: ");
				
				int opcao1 = menu.nextInt();
				
				switch (opcao1)
				{
					case 1:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |  Todo valor doado será convertido em  |");
					System.out.println(" |      alimentos,cobertores, roupas     |");
					System.out.println(" |    medicamentos e itens de higiene    |");
					System.out.println(" +---------------------------------------+");
					
					
					System.out.println("\n------> Qual Valor você deseja doar: ");
					
					
					Float valor=menu.nextFloat();
					
					System.out.println(" +---------------------------------------+");
					System.out.println(" | Seu boleto de R$"+valor+" está pronto ");
					System.out.println(" |   Acesse no link https://ong.org/pay  |");
					System.out.println(" +---------------------------------------+");
					
					break;
				
					case 2:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |  Suas doações de alimentos devem ser  |");
					System.out.println(" |  entregues no nosso ponto de coleta   |");
					System.out.println(" |     Localizado na Rua N° Bairro SP    |");
					System.out.println(" | Horário de Atendimento 08:00 as 17:00 |");
					System.out.println(" +---------------------------------------+");
					break;
				
					case 3:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |   Suas doações de roupas/brinquedos   |");
					System.out.println(" |     devem ser entregues no nosso      |");
					System.out.println(" |           ponto de coleta             |");
					System.out.println(" |     Localizado na Rua N° Bairro SP    |");
					System.out.println(" | Horário de Atendimento 08:00 as 17:00 |");
					System.out.println(" +---------------------------------------+");
					break;
					default:
						System.out.println("Opção Inválida");
					break;
				}	
				break;
				
			
			case 2:
				System.out.println("Opção -> Ajudar Orfanatos Carentes Selecionada");
				System.out.println("Como você gostaria de ajudar?");
				
				System.out.println("Opção 1 - Doação em dinheiro");
				System.out.println("Opção 2 - Doação de Alimentos");
				System.out.println("Opção 3 - Doação de Roupas/Brinquedos");

				System.out.println("Digite uma Opção: ");
				
				int opcao2 = menu.nextInt();
				
				switch (opcao2)
				{
					case 1:
					System.out.println("\nTodo valor doado será somado a outras doaçoes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
					System.out.println("\nQual valor você deseja doar? ");
					 
					Float valor=menu.nextFloat();
					System.out.println("\nSeu boleto no valor de "+valor+" está pronto. Clique no link para ser redirecionado https://ong.org");
					break;
				
					case 2:
					System.out.println("\nSuas doações de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
							+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
					break;
				
					case 3:
					System.out.println("\nSuas doações de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
							+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
					break;
					default:
						System.out.println("Opção Inválida");
					break;
				}
			break;
			
			case 3: 
				System.out.println("Opção-> Ajudar Asilos Carentes");
				System.out.println("Como você gostaria de ajudar?");
				
				System.out.println("Opção 1 - Doação em dinheiro");
				System.out.println("Opção 2 - Doação de Alimentos");
				System.out.println("Opção 3 - Doação de Roupas/Brinquedos");

				System.out.println("Digite uma Opção: ");
				
				int opcao3 = menu.nextInt();
				
				switch (opcao3)
				{
					case 1:
					System.out.println("\nTodo valor doado será somado a outras doaçoes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
					System.out.println("\nQual valor você deseja doar? ");
					 
					Float valor=menu.nextFloat();
					System.out.println("\nSeu boleto no valor de "+valor+" está pronto. Clique no link para ser redirecionado https://ong.org");
					break;
				
					case 2:
					System.out.println("\nSuas doações de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
							+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
					break;
				
					case 3:
					System.out.println("\nSuas doações de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
							+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
					break;
					default:
						System.out.println("Opção Inválida");
					break;
				}
			break;
			default:
				System.out.println("Opção Inválida");
			break;
		}
	}

}
