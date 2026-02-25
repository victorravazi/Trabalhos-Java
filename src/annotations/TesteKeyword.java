class ExemploFinal {
	final int CODIGO_FIXO = 10;

	// Método Final
	final void metodo() {
		System.out.println("Metodo Final");
	}
}

// Metodos Final nao pode ser sobrescrito

public class TesteKeyword extends ExemploFinal {

	// final void metodo() {
	// System.out.println("Metodo Sobrescrito final");
	// }

	public static void main(String[] args) {
		// CODIGO_FIXO = 5; isso nao pode ser feito ja que a variavel é Imutavel
		// (utilizando final)
		ExemploFinal ex1 = new ExemploFinal();
		ex1.metodo();
	}
}

// Por ultimo Classes Final nao podem ser extendidas

// final class Bosta {
// int a;
// }

// class AAAAAA extends Bosta {

// }
// Isso vai dar erro
