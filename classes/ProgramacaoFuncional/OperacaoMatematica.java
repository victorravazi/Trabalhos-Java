@FunctionalInterface
interface Operacao {
	public double executar(double a, double b);
}

public class OperacaoMatematica {
	public static void main(String[] args) {
		Operacao potencia = (a, b) -> Math.pow(a, b);
		System.out.println("Resultado da potenciação: " + potencia.executar(2, 3));

		Operacao raiz = (a, b) -> Math.sqrt(a + b);
		System.out.println("Resultado da raiz quadrada: " + raiz.executar(2, 2));
	}
}
