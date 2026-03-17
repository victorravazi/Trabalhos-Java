@FunctionalInterface
interface Calculadora {
	double calcular(double a, double b);
}

public class CalculadoraFuncional {
	public static void main(String[] args) {
		Calculadora soma = (a, b) -> a + b;
		System.out.println("Resultado da soma: " + soma.calcular(10, 5));

		Calculadora subtracao = (a, b) -> a - b;
		System.out.println("Resultado da subtracao: " + subtracao.calcular(10, 5));
	}
}
