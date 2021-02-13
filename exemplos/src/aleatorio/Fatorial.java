package aleatorio;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		int n = 0;
		int fat;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		fat = funcaoFatorial(n);
		
		JOptionPane.showMessageDialog(null, "O fatorial de " +n+ " é " +fat);

	}

	private static int funcaoFatorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * funcaoFatorial(n -1);
		}
		
	}

}
