import java.util.Locale;
import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho da Matriz: ");
		int N = sc.nextInt();

		int[][] matP = new int[N][N];

		for (int i = 0; i < matP.length; i++) {
			for (int j = 0; j < matP[i].length; j++) {
				System.out.print("Digite um valor na posição " + "(" + i + "," + j + ") da Matriz: ");
				matP[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Main diagonal:");

		for (int i = 0; i < matP[i].length; i++) {
			System.out.print(matP[i][i] + " ");
		}

		System.out.println();

		int sum = 0;
		for (int i = 0; i < matP.length; i++) {
			for (int j = 0; j < matP[i].length; j++) {
				if (matP[i][j] < 0) {
					sum++;
				}
			}
		}

		System.out.println("How many negative numbers: " + sum);

		sc.close();

	}

}
