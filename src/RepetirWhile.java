import java.util.Scanner;

public class RepetirWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Digite um valor: ");
		int x = entrada.nextInt();
		int cont = 0;
		
		while(x!=0) {
			cont += x;
			System.out.print("Digite um valor: ");
			x=entrada.nextInt();
		}
		entrada.close();
		System.out.println("O valor das entradas digitas: " + cont);
	}

}
