package app;

import java.util.Scanner;

import service.ClienteService;

public class Cliente {
	static Scanner input = new Scanner(System.in);
	public static void main (String[] args) {
		
		System.out.println("Deseja um vetor de quantos Elementos? ");
		int[] vetor = ClienteService.criarVetor(input.nextInt());
		
		System.out.println("Qual metodo deseja usar ? ");
		System.out.println("[0] INSERTION");
		System.out.println("[1] SELECTION");
		System.out.println("[2] BUBBLE");
		System.out.println("Opcao: ");
		int opcao = input.nextInt();
	
		
		System.out.println("Vetor criado: ");
		ClienteService.exibir(vetor);
		System.out.println("");
		System.out.println("Vetor Ordenado: ");
		ClienteService.ordenar(opcao, vetor);
		ClienteService.exibir(vetor);
		
		input.close();
	}
}
