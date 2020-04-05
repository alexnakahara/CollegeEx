package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdInsercaoBuscaBinariaEx73 {

	public static void main(String args[]) {

		char vetor[] = new char[10];

		JOptionPane.showMessageDialog(null, "Digite um caracter de cada vez. \nSer�o 10 ao total ");

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = JOptionPane.showInputDialog((i == 0) ? "Digite um caracter"
					: "Digite um caracter. Restam " + (vetor.length - i) + "\nDigitadas: " + Arrays.toString(vetor))
					.charAt(0);

		}

		char key = JOptionPane.showInputDialog("Digite o caracter que deseja buscar").charAt(0);

		// iB = indice baixo, iA = indice alto
		int resultado = BinarySearch(vetor, 0, vetor.length - 1, key);

		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O caracter est� no indice:\n" + resultado);
		} else {
			JOptionPane.showMessageDialog(null, "O caracter n�o foi encontrado \n Tente novamente!\n " + resultado);

		}

	}

	public static int BinarySearch(char vetor[], int iB, int iA, int key) {
		
		char newVetor[] = insertSort(vetor);
		System.out.println("Novo vetor ordenado" + Arrays.toString(newVetor));
		int meio = (iB + iA) / 2;
		if (iB <= iA) {

			if (key < newVetor[meio]) {
				return BinarySearch(newVetor, iB, meio - 1, key);
			} else if (key > newVetor[meio]) {
				return BinarySearch(newVetor, meio + 1, iA, key);
			} else {
				return meio;
			}
		}

		return -1;
	}

	public static char[] insertSort(char v[]) {

		char x;
		int j;

		for (int i = 1; i < v.length; i++) {
			x = v[i];
			j = i - 1;
			while (j >= 0 && x < v[j]) {
				v[j + 1] = v[j];
				j--;
			}
			v[j + 1] = x;
		}

		return v;

	}
	
}