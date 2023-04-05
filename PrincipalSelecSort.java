package vetores;


public class PrincipalSelecSort {
	
	public static void main(String[] args) {
		
		int[] vetorSelection = {2,6,10,5,0,8,1,7};
	
		Ordenacao order = new Ordenacao();
	
		System.out.println("Ordenado: " + order.selectionSort(vetorSelection));
	}
}
