abstract class Operacao {
	public abstract int calcular(int a, int b);
}

class Soma extends Operacao {
	public int calcular(int a, int b) {
		return a + b;
	}
}

class Subtracao extends Operacao {
	public int calcular(int a, int b) {
		return a - b;
	}
}

class Multiplicacao extends Operacao {
	public int calcular(int a, int b) {
		return a * b;
	}
}

class Divisao extends Operacao {
	public int calcular(int a, int b) {
		if (b == 0) {
			System.out.println("Voce nao pode dividir por 0");
			return 0; // retorno obrigatório
		}
		return a / b;
	}
}

class ExercicioCalculadoraPolimorfismo {
	public static void main(String[] args) {
		Operacao soma = new Soma();
		Operacao sub = new Subtracao();
		Operacao mult = new Multiplicacao();
		Operacao div = new Divisao();

		System.out.println(soma.calcular(10, 10));
		System.out.println(sub.calcular(10, 10));
		System.out.println(mult.calcular(10, 10));
		System.out.println(div.calcular(10, 10));
	}
}
