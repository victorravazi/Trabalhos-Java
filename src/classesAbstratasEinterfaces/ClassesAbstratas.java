abstract class Carro {
	int codigo = 10;

	Carro(int cod) {
		codigo = cod;
	}

	abstract void acelerar();

	void frear() {
		System.out.println("Carro freia!");
	}
}

class Caminhao extends Carro {
	Caminhao(int codigo) {
		super(codigo); // Super é usado aqui neste construtor para acessar o codigo na classe Super
	}

	void acelerar() {
		System.out.println("Caminha esta acelerando");
	}
}

public class ClassesAbstratas {
	public static void main(String[] args) {
		Caminhao caminhao1 = new Caminhao(100);
		System.out.println("Codigo " + caminhao1.codigo);
	}
}

// Regras sobre classes abstratas
// 1 - Nao podem ser instanciadas diretamente
// 2 - Podem conter métodos abstratos e nao abstratos
// 3 - Podem conter construtores (com super)
// 4 - Podem conter campos
// 5 - Podem implementar interfaces
