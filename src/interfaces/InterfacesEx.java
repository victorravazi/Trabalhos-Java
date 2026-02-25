interface Animal {
	void fazerSom(); // Metodo Abstrato ( nao tem corpo e esta em uma interface)
}

// Classe cachorro que implementa a interface animal

class Cachorro implements Animal {
	public void fazerSom() { // voce é obrigado a por o metodo fazerSom()
		System.out.println("AUAUAUAU");
	}
}

class Gato implements Animal {
	public void fazerSom() {
		System.out.println("miau");
	}
}

public class InterfacesEx {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.fazerSom();

	}
}
