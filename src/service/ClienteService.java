package service;

import java.util.Scanner;

import entities.MetodoOrdenacao;
import entities.Ordenacao;

public class ClienteService {
	static Scanner input = new Scanner(System.in);

	public static void ordenar(int opcao, int[] list) {
		if(opcao >= 0 && opcao <=2 ) {
			Ordenacao ordenar = MetodoOrdenacao.values()[opcao].getInstance();
	        ordenar.ordenar(list);
		} else {
			throw new IllegalArgumentException("Opção de Enum inválida.");
		}
    }

	public static void exibir(int[] list) {
		System.out.print("Lista: ");
		for (int i = 0; i < list.length; i++) {
			if (i == 0) {
				System.out.print("[" + list[i]);
			} else {
				System.out.print(", " + list[i]);
			}
		}
		System.out.print("]");
	}

	public static int[] criarVetor(int tamanho) {
		int[] vetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Insira o " + 1 + "° valor: ");
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
}
