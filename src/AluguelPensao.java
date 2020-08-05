import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import entities.VetPensao;

public class AluguelPensao {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		VetPensao[] vet = new VetPensao[10];
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();

		System.out.println("----------------------------------------");

		for (int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vet[room] = new VetPensao(name, email);
		}

		System.out.println("----------------------------");

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}

		sc.close();

	}

}
