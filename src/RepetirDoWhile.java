import java.util.Locale;
import java.util.Scanner;

public class RepetirDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		char op;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = entrada.nextDouble();
			double F = ((9 * C) / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
			System.out.print("Deseja repetir (s/n): ");
			op = entrada.next().charAt(0);
			System.out.println("");

		} while (op != 'n');

		entrada.close();

	}

}
