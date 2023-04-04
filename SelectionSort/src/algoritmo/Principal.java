package algoritmo;

import java.util.Arrays;

public class Principal {

	public static int[] vetorSelection = {5,6,2,8,13,2,4,3};

	
	public static void main(String[] args) {
		SelectionSort selecao = new SelectionSort();
		
		System.out.println("Lista ordenada: "+Arrays.toString(selecao.selectionSort(vetorSelection)));
	}
	
	
}
