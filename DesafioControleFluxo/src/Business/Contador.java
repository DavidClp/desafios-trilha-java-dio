package Business;

import java.util.Scanner;

import Exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		 for(int i = 0; i < contagem; i++) {
			 System.out.println("Imprimindo o número " + (i+1));
		 }
	}
}