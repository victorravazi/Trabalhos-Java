interface PedidoRestaurante {
	void adicionarItem(String item, double preco);

	double calculaTotal();
}

class Pedido implements PedidoRestaurante {
	int total = 0;

	@Override
	public void adicionarItem(String item, double preco) {
		System.out.println("Adicionado: " + item + " por R$ " + preco);
		total += preco;
	}

	@Override
	public double calculaTotal() {
		return total;
	}
}

public class InterfaceRestaurante {
	public static void main(String[] args) {
		Pedido p1 = new Pedido();
		p1.adicionarItem("Banana", 13.0);
		p1.adicionarItem("uva", 11.0);
		System.out.println("Total do pedido " + p1.calculaTotal());
	}
}
