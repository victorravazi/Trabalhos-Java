class Animal {
	public String nome;

	public void fazerSom() {
		System.out.println("Som de animal é feito");
	}
}

class Cachorro extends Animal {
	@Override
	public void fazerSom() {
		System.out.println("Som de cachorro");
	}
}

public class TesteAnnotations {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.fazerSom();
	}
}
