package Calculadora;

public class Calc {

	
	int Soma (int a, int b) {

		int result = a+b;
		
		return result;
	}
	
	int Sub (int a, int b) {

		int result = a-b;
		
		return result;
	}
	
	int Div (int a, int b) {

		int result = a/b;
		
		return result;
	}
	
	int Mult (int a, int b) {

		int result = a*b;
		
		return result;
	}
	
	int Expo (int a, int b) {
		int result = 1,i;
		
		for(i = 0; i < b; i++) 
		{
			result *= a;
		}
		
		return result;
	}
	
	int Raiz (int a, int b) {
		int i, j, cont = 1;
		
		for(i = 1; i <= a/b; i++) 
		{
			cont = i;
			for (j = 1; j < b; j++) {
				cont *= i;
			}
			if(cont == a) {
				return i;
			}
		}
		return 0;
	}
}
