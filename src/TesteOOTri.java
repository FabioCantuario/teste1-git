import java.util.Locale;
import java.util.Scanner;

public class TesteOOTri {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double a, b, c, x, y, z, T, t, areaX, areaY;

		Scanner dados = new Scanner(System.in);

		System.out.println("Entre com os valores do Triângilo X:");
		System.out.print("Digite o 1º valor: ");
		a = dados.nextDouble();
		System.out.print("Digite o 2º valor: ");
		b = dados.nextDouble();
		System.out.print("Digite o 3º valor: ");
		c = dados.nextDouble();

		System.out.println("Entre com os valores do Triângilo Y:");
		System.out.print("Digite o 1º valor: ");
		x = dados.nextDouble();
		System.out.print("Digite o 2º valor: ");
		y = dados.nextDouble();
		System.out.print("Digite o 3º valor: ");
		z = dados.nextDouble();

		T = calculoT(a, b, c);
		t = calculot(x, y, z);
		areaX = Math.sqrt(T * (T - a) * (T - b) * (T - c));
		areaY = Math.sqrt(t * (t - x) * (t - y) * (t - z));

		imprimirMaior(areaX, areaY);

		dados.close();
	}

	public static double calculoT(double a, double b, double c) {
		return (a + b + c) / 2;
	}

	public static double calculot(double x, double y, double z) {
		return (x + y + z) / 2;
	}

	public static void imprimirMaior(double T, double t) {
		System.out.printf("A área do Triângulo X é: %.2f%n", T);
		System.out.printf("A área do Triângulo Y é: %.2f%n", t);
		if (T > t) {
			System.out.println("A maior área é do Triângulo X, valor:" + T);
		} else {
			System.out.println("A maior área é do Triângulo Y, valor:" + t);
		}

		return;

	}
}
