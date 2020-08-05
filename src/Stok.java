import java.util.Locale;
import java.util.Scanner;
import entities.Menu;
import entities.Produto;

public class Stok {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Produto product = new Produto();
		Scanner entrada = new Scanner(System.in);
		Menu menu = new Menu();

		int op = 0;
		
		while (op != 5) {
			menu.menuP();
			op = entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("");
				System.out.print("Descrição do Produto: ");
				product.name = entrada.next();
				System.out.print("Valor: ");
				product.price= entrada.nextDouble();
				System.out.print("Quantidade: ");
				product.quantity=entrada.nextInt();
				System.out.println("");
				break;
			case 2:
				System.out.print("Digite a quantidade Saída: ");
				product.RemoveProducts(entrada.nextInt());
				System.out.println("");
				break;
			case 3:
				product.ImprimirDados();
				System.out.println("");
				break;
			case 4:
				System.out.print("Digite a quantidade de Entrada: ");
				product.AddProducts(entrada.nextInt());
				System.out.println("");
				break;
			case 5:
				System.out.println("Você saiu do sistema.");
				break;
			default:
				System.out.println("");
				System.out.println("Opção Inválida!!!!");
				System.out.println("");
				break;
			}

		}
	    entrada.close();

	}

}
