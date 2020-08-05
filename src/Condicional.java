import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		int x;
		Scanner dados = new Scanner(System.in);
	
		System.out.print("Digite um horário: ");
		x = dados.nextInt();
		dados.close();
		
		if (x<12) {
			System.out.println("Bom dia!!!");
		}
		else {
			if ((x>12)&&(x<18)){
				System.out.println("Boa tarde!!");
			}
			else {
				System.out.println("Boa noite!!");
			}
		}

	}

}
