package recursiva;

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		int [] vetor = {4,6,7,3,5,1,2,8};
		int [] vetorAuxiliar = new int[vetor.length];
		
		System.out.println(Arrays.toString(vetor));
		
		ordenar(vetor, vetorAuxiliar, 0, vetor.length  -1);
		
		System.out.println(Arrays.toString(vetor));

	}

	private static void ordenar(int[] vetor, int[] vetorAuxiliar, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenar(vetor, vetorAuxiliar, inicio, meio);
			ordenar(vetor, vetorAuxiliar, meio+1, fim);
			intercalar(vetor, vetorAuxiliar, inicio, meio, fim);
		}
		
	}

	private static void intercalar(int[] vetor, int[] vetorAuxiliar, int inicio, int meio, int fim) {
		for (int k = inicio; k <= fim; k ++ ) 
			vetorAuxiliar[k] = vetor[k];
		int i = inicio;
		int j = meio + 1;
		
		for (int k = inicio; k <= fim; k ++) {
			if (i > meio) {
				vetor[k] = vetorAuxiliar[j++];
			} else if (j > fim) {
				vetor[k] = vetorAuxiliar[i++];
			} else if (vetorAuxiliar[i] < vetorAuxiliar[j]) {
				vetor[k] = vetorAuxiliar[i++];
			} else {
				vetor[k] = vetorAuxiliar[j++];
			}
		}
			
		
	}

}
