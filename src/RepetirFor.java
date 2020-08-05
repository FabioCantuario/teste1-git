import java.util.Scanner;

public class RepetirFor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int N = entrada.nextInt();
		int soma = 0;

		for (int i = 0; i < N; i++) {
			int x = entrada.nextInt();
			soma += x;
		}

		System.out.println("Soma dos valores: " + soma);

		entrada.close();

	}

}
