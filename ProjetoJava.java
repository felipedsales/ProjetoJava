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
		
		System.out.println("\nQual �rea voc� gostaria de ajudar?\nDigite 1 para moradores de rua\nDigite 2 para "
				+ "orfanatos\nDigite 3 para asilos");
		x=leia.nextInt();
		
		if(x==1)
		{
			System.out.println("\nComo quer ajudar?\nOp��o 1 - Doa��o em dinheiro\r\n"
					+ "Op��o 2 - Doa��o de alimentos \nOp��o 3 - Doa��o de "
					+ "roupas/brinquedos\r\n"
					+ " ");
			op=leia.nextInt();
			if(op==1)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nTodo valor doado ser� somado a outras doa�oes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
				System.out.println("\nQual valor voc� deseja doar? ");
				valor=leia.nextFloat();
				System.out.println("\nSeu boleto no valor de "+valor+" est� pronto. Clique no link para ser redirecionado https://ong.org");
			}
			else if(op==2)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doa��es de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
				
			}
			else if(op==3)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doa��es de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
			}
			
		}
		if(x==2)
		{
			System.out.println("\nComo quer ajudar?\nOp��o 1 - Doa��o em dinheiro\r\n"
					+ "Op��o 2 - Doa��o de alimentos \nOp��o 3 - Doa��o de "
					+ "roupas/brinquedos\r\n"
					+ " ");
			op=leia.nextInt();
			if(op==1)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nTodo valor doado ser� somado a outras doa�oes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
				System.out.println("\nQual valor voc� deseja doar? ");
				valor=leia.nextFloat();
				System.out.println("\nSeu boleto no valor de "+valor+" est� pronto. Clique no link para ser redirecionado https://ong.org");
			}
			else if(op==2)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doa��es de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
				
			}
			else if(op==3)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doa��es de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
			}
			
		}
		if(x==3)
		{
			System.out.println("\nComo quer ajudar?\nOp��o 1 - Doa��o em dinheiro\r\n"
					+ "Op��o 2 - Doa��o de alimentos \nOp��o 3 - Doa��o de "
					+ "roupas/brinquedos\r\n"
					+ " ");
			op=leia.nextInt();
			if(op==1)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nTodo valor doado ser� somado a outras doa�oes e convertido em alimentos, cobertores, roupas, medicamentos e itens de higiene");
				System.out.println("\nQual valor voc� deseja doar? ");
				valor=leia.nextFloat();
				System.out.println("\nSeu boleto no valor de "+valor+" est� pronto. Clique no link para ser redirecionado https://ong.org");
			}
			else if(op==2)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doa��es de alimentos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
				
			}
			else if(op==3)
			{
				System.out.println("\nDigite seu nome: ");
				nome=leia.next();
				System.out.println("\nDigite seu e-mail: ");
				email=leia.next();
				System.out.println("\nSuas doa��es de roupas/brinquedos devem ser entregues no nosso ponto de coleta das 08:00 as 17:00"
						+ "\nQue fica localizado na Rua ****, N�mero 2, Vila tal, S�o Paulo");
			}
			
		
		}
		
		
		}
	

}
