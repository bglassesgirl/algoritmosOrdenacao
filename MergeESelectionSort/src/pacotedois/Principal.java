package pacotedois;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = {4,2,1,5,9,6,0,3};
		int[] aux = new int[vetor.length]; // assim o vetor aux sempre tera o mesmo tamanho do principal
		
		mergeSort(vetor, aux, 0, vetor.length-1);
		
		System.out.println(Arrays.toString(vetor));
		
		
	}
	
	public static void mergeSort(int[] vetor, int[] aux, int inicio, int fim) {
		
		if(inicio < fim) {
			
			int meio = (inicio + fim /2); // dividindo o vetor
			mergeSort(vetor, aux, inicio, meio); //aplicado a recursividade 
			mergeSort(vetor, aux, meio+1, fim); // nas duas divisoes, parte esquerda e parte direita
			
			intercalar(vetor, aux, inicio, meio, fim); // comparar as duas partes dos vetores
			
		}
	
	}
	
	private static void intercalar(int[] vetor, int[] aux, int inicio, int meio, int fim) {
			
			//passar os valores do vetor principal ao auxiliar
			for(int i = inicio; i <= fim; i++) {
				aux[i] = vetor[i];
			}
			
			//definindo cada lado
			int esq = inicio;
			int dir = meio + 1;
			
			for(int i = inicio; i <= fim; i++) {
				
				if(esq > meio) {
					
					vetor[i] = aux[dir++];
					
				} else if (dir > fim) {
					
					vetor[i] = aux[esq++];
					
				} else if (aux[esq] < aux[dir]) {
					
					vetor[i] = aux[esq++];
					
				} else {
					
					vetor[i] = aux[dir++];
					
				}	
		}
	}
}