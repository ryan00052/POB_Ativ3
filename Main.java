package Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0,b = 0, menu = 7;
		
		Calc calc = new Calc();
		
		Scanner sc = new Scanner(System.in);
		
		while(menu != 0) 
		{
			System.out.print("Selecione uma das opções abaixo de acordo com o número indicado.\n1 - Soma.\n2 - Subtração\n3 - Divisão\n4 - Multiplicação\n5 - Exponenciação\n6 - Raiz\n0 - Sair\n\n>>");
			menu = sc.nextInt();
			
			if(menu != 0) 
			{
				System.out.println("Digite o valor da variavel 1\n>>");
				a = sc.nextInt();
			
				System.out.println("Digite o valor da variavel 2\n>>");
				b = sc.nextInt();	
			}
				
			switch (menu) {
			case 1: 
				System.out.println("Soma: " + calc.Soma(a, b));
				break;
			
			case 2: 
				System.out.println("Subtração: " + calc.Sub(a, b));
				break;
				
			case 3: 
				System.out.println("Divisão: " + calc.Div(a, b));
				break;
			
			case 4: 
				System.out.println("Multiplicação: " + calc.Mult(a, b));
				break;	
				
			case 5: 
				System.out.println("Exponencial: " + calc.Expo(a, b));
				break;	
				
			case 6: 
				System.out.println("Raiz: " + calc.Raiz(a, b));
				break;
			default:
				System.out.println("Sessão encerrada.");
				break;
			}
			
		}
		
		sc.close();
		
	}

}
