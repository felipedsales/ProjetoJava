package Familia36;

import java.util.Scanner;

public class ProjetoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,op;
		float valor;
		String nome,email;
		
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("**********************************************************************************");
		System.out.println("******************************* Seja Bem-vinde a ONG *****************************");
		System.out.println("**********************************************************************************");
		
		System.out.println("\nQual área você gostaria de ajudar?\nDigite 1 para moradores de rua\nDigite 2 para "
				+ "orfanatos\nDigite 3 para asilos");
		x=leia.nextInt();
		
		if(x==1)
		{
			System.out.println("\nComo quer ajudar?\nOpção 1 - Doação em dinheiro\r\n"
					+ "Opção 2 - Doação de alimentos \nOpção 3 - Doação de "
					+ "roupas/brinquedos\r\n"
					+ " ");
			op=leia.nextInt();
			if(op==1)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nTodo valor doado será somado a outras doaçoes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
				System.out.println("\nQual valor você deseja doar? ");
				valor=leia.nextFloat();
				System.out.println("\nSeu boleto no valor de "+valor+" está pronto. Clique no link para ser redirecionado https://ong.org");
			}
			else if(op==2)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doações de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
				
			}
			else if(op==3)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doações de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
			}
			
		}
		if(x==2)
		{
			System.out.println("\nComo quer ajudar?\nOpção 1 - Doação em dinheiro\r\n"
					+ "Opção 2 - Doação de alimentos \nOpção 3 - Doação de "
					+ "roupas/brinquedos\r\n"
					+ " ");
			op=leia.nextInt();
			if(op==1)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nTodo valor doado será somado a outras doaçoes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
				System.out.println("\nQual valor você deseja doar? ");
				valor=leia.nextFloat();
				System.out.println("\nSeu boleto no valor de "+valor+" está pronto. Clique no link para ser redirecionado https://ong.org");
			}
			else if(op==2)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doações de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
				
			}
			else if(op==3)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doações de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
			}
			
		}
		if(x==3)
		{
			System.out.println("\nComo quer ajudar?\nOpção 1 - Doação em dinheiro\r\n"
					+ "Opção 2 - Doação de alimentos \nOpção 3 - Doação de "
					+ "roupas/brinquedos\r\n"
					+ " ");
			op=leia.nextInt();
			if(op==1)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nTodo valor doado será somado a outras doaçoes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
				System.out.println("\nQual valor você deseja doar? ");
				valor=leia.nextFloat();
				System.out.println("\nSeu boleto no valor de "+valor+" está pronto. Clique no link para ser redirecionado https://ong.org");
			}
			else if(op==2)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doações de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
				
			}
			else if(op==3)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doações de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, Número 2, Vila tal, São Paulo");
			}
			
		
		}
		
		
		}
	

}
