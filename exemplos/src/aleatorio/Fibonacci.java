package aleatorio;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 0;
		int fibo;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		fibo = funcaoFibonacci(n);
		
		JOptionPane.showMessageDialog(null, "Fibonacci: " + fibo);
	}

	private static int funcaoFibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		else {
			
		}
		return funcaoFibonacci(n - 1) + funcaoFibonacci(n - 2);
	}

}
