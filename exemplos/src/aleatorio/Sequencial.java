package aleatorio;

import javax.swing.JOptionPane;

public class Sequencial {

	public static void main(String[] args) {
		int[] array = {89, 5, 55, 29, 74};
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero a ser procurado"));
		
		procuraElemento(n, array);
		
	}

	private static void procuraElemento(int n, int[] array) {
		for (int i = 0; i < array.length; i ++ ) {
			if (n == array[i]) {
				JOptionPane.showMessageDialog(null, "O valor foi encontrado no indice: " + i);
				return;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O valor foi nao foi encontrado");
	}

}
