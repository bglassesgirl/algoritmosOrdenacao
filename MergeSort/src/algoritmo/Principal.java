package algoritmo;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = in.nextInt();
		int[] vetor = new int[tamanho];

		for (int cont = 0; cont < tamanho; cont++) {
			System.out.println("Digite o valor para cada posição " + cont + " do vetor");
			vetor[cont] = in.nextInt();

		}

		/*System.out.println("Vetor inserido pelo usuário: ");
		for (int cont = 0; cont < tamanho; cont++) {
			System.out.println(vetor[cont]);
		}*/

		MergeSort ordenacao = new MergeSort();
		ordenacao.executarMergeSort(vetor);
		System.out.println(Arrays.toString(vetor));
		
		}
	}


