class Peixe {
	private String nome;
	private int tamanho;

	public Peixe(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	@Override
	public String toString() {
		return "Peixe " + nome + " | Tamanho " + tamanho;
	}
}

class Polvo {
	private String nome;
	private int tentaculos;

	public Polvo(String nome, int tentaculos) {
		this.nome = nome;
		this.tentaculos = tentaculos;
	}

	public String getNome() {
		return nome;
	}

	public int getTentaculos() {
		return tentaculos;
	}

	@Override
	public String toString() {
		return "Peixe " + nome + " | Tentaculos " + tentaculos;
	}
}

public class Cesto<T> {
	private T conteudo;

	public void guardar(T AnimalMarinho) {
		conteudo = AnimalMarinho;
		System.out.println("Objeto foi guardado no cesto");
	}

	public T pegar() {
		return conteudo;
	}

	public static void main(String[] args) {
		Cesto<Peixe> cestoDePeixes = new Cesto<>();
		Cesto<Polvo> cestoDePolvos = new Cesto<>();

		Peixe peixe1 = new Peixe("Nemo", 2);
		cestoDePeixes.guardar(peixe1);

		Polvo polvo1 = new Polvo("Octavio", 5);
		cestoDePolvos.guardar(polvo1);

		Peixe peixeRetirado = cestoDePeixes.pegar();
		Polvo polvoRetirado = cestoDePolvos.pegar();

		System.out.println(peixeRetirado);
		System.out.println(polvoRetirado);

	}
}
