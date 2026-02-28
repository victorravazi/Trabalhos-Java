// Regras de interface
// nao podem ser instanciadas
// todos os atributos dentro de uma instancia sao obrigatoriamente public, final e static
// todos os metodos devem ser o mais acessiveis possivel, ou seja, devem ser public
// A palavra abstract no metodo é opcional
// uma interface pode extender outras interfaces
interface SerVivo {
	void respirar(); // Metodo abstrato
}

interface Animal extends SerVivo {
	String DESCRICAO = "Animal é um ser vivo importante";

	// Ao rodar o programa o compilador coloca publi static final na frente da
	// String fazendo assim com que o programa rode mesmo sem colocar nada
	void fazerSom(); // Metodo Abstrato ( nao tem corpo e esta em uma interface)
}

// Classe cachorro que implementa a interface animal

class Cachorro implements Animal {
	public void respirar() {
		System.out.println("Cachorro respira");
	}

	public void fazerSom() { // voce é obrigado a por o metodo fazerSom()
		System.out.println("AUAUAUAU");
	}
}

public class InterfacesEx {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		// Animal animal1 = new Animal();
		// Classe Animal nao pode ser instanciada diretamente pois é uma interface
		System.out.println("Descricao da interface Animal: " + Animal.DESCRICAO);
		dog.fazerSom();

	}
}
