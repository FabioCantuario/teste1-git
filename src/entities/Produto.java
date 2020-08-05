package entities;

public class Produto {

	public String name;
	public double price;
	public int quantity;

	public int AddProducts(int quantity) {
		return this.quantity += quantity;
	}

	public int RemoveProducts(int quantity) {
		return this.quantity -= quantity;
	}

	public void ImprimirDados() {
		System.out.println("Descrição: " + name);
		System.out.printf("Preço: %.2f%n", price);
		System.out.println("Quantidade: " + quantity);
		System.out.printf("Valor Total Estoque: %.2f%n", TotalValueStok());
	}

	public double TotalValueStok() {
		return price * quantity;
	}

}
