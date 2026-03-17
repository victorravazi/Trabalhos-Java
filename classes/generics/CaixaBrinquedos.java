class Carrinho {
	private String modelo;

	public Carrinho(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}
}

class Boneca {
	private String nome;

	public Boneca(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}

public class CaixaBrinquedos {
	public static void main(String[] args) {
		Carrinho c = new Carrinho("Hot whells");
		Boneca b = new Boneca("barbie");
	}
}
