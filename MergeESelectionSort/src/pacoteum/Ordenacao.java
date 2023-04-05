package pacoteum;

import java.util.Arrays;

public class Ordenacao {
	
	public String selectionSort(int[] vetor) {
		
		for(int i = 0; i < vetor.length-1; i++) { // o -1 e para nao comparar o ultimo valor que ja e o maior 
			
			int menorIndex = i; // armazena o index do menor valor
			
			for (int j = i + 1; j < vetor.length; j++) { // o j e +1 a frente do i
				
				if(vetor[j] < vetor[menorIndex]) {
					menorIndex = j;
				}
				
			}
			
			int aux = vetor[menorIndex]; 
			vetor[menorIndex] = vetor[i]; // armazena o menor valor encontrado ate agora
			vetor[i] = aux; // troca dos valores
		}
		
		
		return Arrays.toString(vetor);
	}

	
}
