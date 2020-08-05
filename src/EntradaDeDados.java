import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		double x;
		double y;
		double M;
		
		Scanner dados = new Scanner(System.in);
		
		System.out.print("Digite uma nota: ");
		x=dados.nextDouble();
		System.out.print("Digite segunda nota: ");
		y=dados.nextDouble();
		dados.close();
		M=(x+y)/2;
		System.out.println("A média do aluno é: " + M);
		if (M>=7) {
			System.out.println("Aluno aprovado!");
		}
		else { 
			System.out.println("Aluno reprovado!");
		}

	}

}
