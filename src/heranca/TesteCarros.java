class Veiculo {
	public String nome;
	public String modelo;

	public Veiculo(String nome, String modelo) {
		this.nome = nome;
		this.modelo = modelo;
	}

	public void acelerar() {
		System.out.println("(som de veiculo acelerando)");
	}
}

class Carro extends Veiculo {
	public Carro(String nome, String modelo) {
		super(nome, modelo);
	}

	public void acelerar() {
		System.out.println("VRUMMMM (som de carro)");
	}
}

public class TesteCarros {
	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo("Honda", "Civic");
		carro1.acelerar();

		Carro car1 = new Carro("Argo", "2024");
		car1.acelerar();
	}
}
