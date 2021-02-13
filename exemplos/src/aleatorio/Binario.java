package aleatorio;

import javax.swing.JOptionPane;

public class Binario {

	public static void main(String[] args) {
		int[] array = {5, 29, 55, 74, 89};
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero a ser procurado"));
		
		procuraElemento(n, array, 0, array.length);

	}

	private static void procuraElemento(int n, int[] array, int left, int right) {
		int indice;
		if ( right >= left ) {
			indice = ( left + (right - left) / 2);
			if (n == array[indice]) {
				JOptionPane.showMessageDialog(null, "O valor foi encontrado no indice: " + indice);
				return;
			}
			if (array[indice] > n) {
				procuraElemento(n, array, left, indice-1);
				return;
			} else {
				procuraElemento(n, array, indice+1, right);
				return;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O valor foi nao foi encontrado");
		
	}

}
