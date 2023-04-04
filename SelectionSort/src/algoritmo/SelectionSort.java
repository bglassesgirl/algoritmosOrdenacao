package algoritmo;

import java.util.Arrays;

public class SelectionSort {

	/* public static void main(String[] args) {
		
		int [] numeros = {10, 7, 2, 12, 5, 9};
		System.out.println("Lista A: "+Arrays.toString(numeros));
		System.out.println("Lista B: "+ Arrays.toString(selectionSort(numeros)));

	}*/
	
	public static int[] selectionSort(int[] lista) {
		int n = lista.length;

		for (int posInicial = 0; posInicial < n - 1; posInicial++) {
             
			int menorPos1 = posInicial; 
			for (int cont = posInicial; cont < n; cont++) {
				if (lista[cont] < lista[menorPos1]) {
					menorPos1 = cont;
				}
			}
			
			if (lista[posInicial] > menorPos1) {
				int auxiliar = lista[posInicial];
				lista[posInicial] = lista[menorPos1];
				lista[menorPos1] = auxiliar;
			}
		}
		return lista;
	}
}
