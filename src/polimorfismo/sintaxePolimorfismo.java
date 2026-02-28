abstract class Animal extends Object {
	public abstract void fazerSom();
}

class Cachorro extends Animal {
	public void fazerSom() {
		System.out.println("O cachorro faz: au au");
	}
}

class Gato extends Animal {
	public void fazerSom() {
		System.out.println("O gato faz: miau miau");
	}
}

public class sintaxePolimorfismo {
	public static void main(String[] args) {
		Object meuCachorro = new Cachorro();
		Object meuGato = new Gato();

		Cachorro objConvertido = (Cachorro) meuCachorro; // Casting Object
		objConvertido.fazerSom();

		// tambem pode ser feito em uma linha
		((Cachorro) meuCachorro).fazerSom();
	}
}
