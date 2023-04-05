package vetores;

import java.util.Arrays;

public class PrincipalMergeSort {
	
public static void main(String[] args) {
		
		int [] vetor = {10,7,18,9,16,4};
		int[] vetorAuxiliar = new int[vetor.length];

		mergeSort(vetor, vetorAuxiliar, 0, vetor.length - 1);
		
		System.out.println(Arrays.toString(vetor));
	}
	

	private static void mergeSort(int[] vetor, int[] vetorAuxiliar, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, vetorAuxiliar, inicio, meio);
			mergeSort(vetor, vetorAuxiliar, meio + 1, fim);
			intercalar(vetor, vetorAuxiliar, inicio, meio, fim);
		}
	}

	private static void intercalar(int[] vetor, int[] vetorAuxiliar, int inicio, int meio, int fim) {
		for (int cont = inicio; cont <= fim; cont++) {
			vetorAuxiliar[cont] = vetor[cont];
		}

		int left = inicio;
		int right = meio + 1;

		for (int cont = inicio; cont <= fim; cont++) {

			if (left > meio) {
				vetor[cont] = vetorAuxiliar[right++];
			} else if (right > fim) {
				vetor[cont] = vetorAuxiliar[left++];
			} else if (vetorAuxiliar[left] < vetorAuxiliar[right]) {
				vetor[cont] = vetorAuxiliar[left++];
			} else {
				vetor[cont] = vetorAuxiliar[right++];

			}
		}

	}

}
