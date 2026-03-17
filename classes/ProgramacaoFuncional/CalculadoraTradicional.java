public class CalculadoraTradicional {
	public double somar(double a, double b) {
		return a + b;
	}

	public double subtrair(double a, double b) {
		return a - b;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public double dividir(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		CalculadoraTradicional calculadora = new CalculadoraTradicional();

		double resultadoSoma = calculadora.somar(10, 15);
		System.out.println("Resultado da soma " + resultadoSoma);

		double resultadoSub = calculadora.subtrair(10, 5);
		System.out.println("Resultado da subtraca " + resultadoSub);
	}
}
