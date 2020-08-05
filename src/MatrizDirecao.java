import java.util.Locale;
import java.util.Scanner;

public class MatrizDirecao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor para M: ");
		int M = sc.nextInt();
		System.out.print("Digite um valor para N: ");
		int N = sc.nextInt();

		int[][] matriz = new int[M][N];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite um valor para posição " + "(" + i + "," + j + "):");
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Matriz: ");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j] + " ");
			}
		}

		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		System.out.print("Digite um valor para X: ");
		int X = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == X) {
					System.out.println("O valor de X está na posição: " + i + "," + j);

					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
