package vetores;

import java.util.Arrays;

public class PrincipalMergeSort {
	
public static void main(String[] args) {
		
		int [] vetor = {10,7,18,9,16,4};
		
		int[] vetorAuxiliar = new int[vetor.length]; // assim o vetor aux sempre tera o mesmo tamanho do principal

		mergeSort(vetor, vetorAuxiliar, 0, vetor.length - 1);
		
		System.out.println(Arrays.toString(vetor));
	}
	

	private static void mergeSort(int[] vetor, int[] vetorAuxiliar, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2; // dividindo o vetor
			mergeSort(vetor, vetorAuxiliar, inicio, meio); //aplicado a recursividade 
			mergeSort(vetor, vetorAuxiliar, meio + 1, fim); // nas duas divisoes, parte esquerda e parte direita
			
			intercalar(vetor, vetorAuxiliar, inicio, meio, fim); // comparar as duas partes dos vetores
		}
	}

	private static void intercalar(int[] vetor, int[] vetorAuxiliar, int inicio, int meio, int fim) {
		
		//passar os valores do vetor principal ao auxiliar
		for (int cont = inicio; cont <= fim; cont++) {
			vetorAuxiliar[cont] = vetor[cont];
		}
		
		//definindo cada lado
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
