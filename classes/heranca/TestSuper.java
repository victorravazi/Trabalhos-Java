class Animal {
	String nome;

	Animal(String nome) {
		this.nome = nome;
	}
}

class Cachorro extends Animal {
	String raca;

	Cachorro(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}
}

public class TestSuper {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("pitoco", "viralata");
		System.out.println("Nome do animal: " + dog.nome);
		System.out.println("Raca do animal: " + dog.raca);
	}
}
